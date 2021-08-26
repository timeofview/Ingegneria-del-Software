
public class TestPrinter{
	
	private Printer printer;
	
	@Before
	public void setUp(){
		printer= new Printer();
	}
	
	@Test	
	public void testCostruttore(){
		Assert.assertNull(printer.getId());
		Assert.assertNull(client.getName());
		Assert.assertNull(client.getBrand());
		Assert.assertNull(client.getLayerResolution());
		Assert.assertNull(client.getReleaseDate());
		Assert.assertNull(client.getLength());
		Assert.assertNull(client.getDepth());
		Assert.assertNull(client.getHeight());
		Assert.assertNull(client.getPrintSpeed());
		Assert.assertNull(client.getImagePath());
		Assert.assertNull(client.getPrinterTechnology());
		
	}
	
	
	@Test	
	public void testGetter(){
		
		PrinterTechnology pt = new PrinterTechnology(UUID.randomUUID(), "Fusion", "fusione del materiale");
		
			
		LocalDate release = new LocalDate.of(2000, 1, 8);
		printer = new Printer(UUID.randomUUID(), "nomeStampante", "Brand", "layer", release, Double.valueOf(5.1), Double.valueOf(5.1), Double.valueOf(5.1), "velocità:2", "imagePath", pt);
		
		Assert.assertEquals(printer.getName(), "nomeStampante");
		Assert.assertEquals(printer.getBrand, "Brand");
		Assert.assertEquals(printer.getLayerResolution(), "layer");
		Assert.assertEquals(printer.getReleaseDate(), release);
		Assert.assertEquals(printer.getLenght(), Double.valueOf(5.1));
		Assert.assertEquals(printer.getDepth(), Double.valueOf(5.1));
		Assert.assertEquals(printer.getHeight(), Double.valueOf(5.1));
		Assert.assertEquals(printer.getPrintSpeed(), "velocità:2");
		Assert.assertEquals(printer.getImagePath(), "imagePath");
		Assert.assertEquals(printer.getPrinterTechnology(), pt);
	}
	
	@Test	
	public void testSetter(){
		
				
		PrinterTechnology pt = new PrinterTechnology(UUID.randomUUID(), "Fusion", "fusione del materiale");
		
			
		LocalDate release = new LocalDate.of(2000, 1, 8);
		
		printer.setName("nomeStampante");
		Assert.assertEquals(printer.getName(), "nomeStampante");
		printer.setBrand("Brand");
		Assert.assertEquals(printer.getBrand, "Brand");
		printer.setLayerResolution("layer");
		Assert.assertEquals(printer.getLayerResolution(), "layer");
		printer.setReleaseDate(release);
		Assert.assertEquals(printer.getReleaseDate(), release);
		printer.setLenght(Double.valueOf(5.1));
		printer.setDepth(Double.valueOf(5.1));
		printer.setHeight(Double.valueOf(5.1));
		Assert.assertEquals(printer.getLenght(), Double.valueOf(5.1));
		Assert.assertEquals(printer.getDepth(), Double.valueOf(5.1));
		Assert.assertEquals(printer.getHeight(), Double.valueOf(5.1));
		printer.setPrintSpeed("velocità:2");
		Assert.assertEquals(printer.getPrintSpeed(), "velocità:2");
		printer.setImagePath("imagePath");
		Assert.assertEquals(printer.getImagePath(), "imagePath");
		printer.setPrinterTechnology(pt);
		Assert.assertEquals(printer.getPrinterTechnology(), pt);
		
	}
}