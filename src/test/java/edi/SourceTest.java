package edi;

import static org.junit.Assert.*;

import java.nio.file.Files;

import org.junit.Test;

public class SourceTest {

	@Test
	public void test() {
		// new IScenario("NameOfScenario"){
		// new Partner("Name")
		// new FileSource("Path")
		// new StageAdapter("Stage 1")
		// //As there is a JVM boundary
		// //new AS2Channel("DMZ2Central")
		// new AS2Destinaion()
		// new AS2Source()
		// new StageAdapter("Stage 2")
		// new ArchiveAdapter()
		// new MappingAdapter("Mapping")
		// new StageAdapter("Stage 3")
		// new FileDestination("Path")
		// };
		//
		// new FileSource(
		// new StageAdapter(
		// new AS2Destination)
		// ).start();
		// new AS2Source(
		// new StageAdapter(
		// new ArchiveAdapter(
		// new MappingAdapter(
		// new ForkAdapter(
		// new StageAdapter(
		// new FileDestination)
		// new ControlAdapter(
		// new ...)))))
		// ).start();

		fail("Not yet implemented");
	}

	@Test
	public void testSourceToDestination() {
		new FileSource(
		  "./src", 
		  new FileDestination("./dest")
		).retrieve();
	}
	
	@Test
	public void testSourceToAdapter() {
		new FileSource(
		  "./src", 
		  new StageAdapter(
		    "Stage 1",
		    new FileDestination("./dest")
		  )
		).retrieve();
	}

	@Test
	public void testMultipleAdapters() {
		new FileSource(
			"./src",
			new StageAdapter(
				"Stage 1",
				new StageAdapter(
					"Stage 2",
					new FileDestination("./dest")
				)
			)
		).retrieve();
	}
}
