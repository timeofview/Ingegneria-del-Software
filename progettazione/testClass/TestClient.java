
public class TestClient{
	
	private Client client;
	
	@Before
	public void setUp(){
		client= new Client();
	}
	
	@Test	
	public void testCostruttore(){
		Assert.assertNull(client.getUsername());
		Assert.assertNull(client.getEmail());
		Assert.assertNull(client.getPassword());
		Assert.assertNull(client.getRole());
		Assert.assertNull(client.getSuspendedDateTime());
		Assert.assertNull(client.getAtivatedDateTime());
		Assert.assertNull(client.getFirstName());
		Assert.assertNull(client.getLastName());
		Assert.assertNull(client.getBirthday());
		Assert.assertNull(client.getAvatarFilePath());
		Assert.assertNull(client.getAddresses());
		
	}
	
	
	@Test	
	public void testGetter(){
		
		List<Address> addresses = new ArrayList<Address>();
		addresses.add(new Address("Italy", "Bologna", "64100", "Via del Risorgimento", "2"));
		
		LocalDate birthday = new LocalDate.of(2000, 1, 8);
		client= new Client("UsernameFigo", "Password" , "enrica.dentiera@studio.unibo.it", "Enrica",
							"Dentiera", birthday, "C:/resources/ProfilesPhotos/UsernameFigo", addresses);
		Assert.assertEquals(client.getUsername(), "UsernameFigo");
		Assert.assertEquals(client.getEmail(), "enrica.dentiera@studio.unibo.it");
		Assert.assertEquals(client.getPassword(), "Password");
		Assert.assertEquals(client.getFirstName(), "Enrica");
		Assert.assertEquals(client.getLastName(), "Dentiera");
		Assert.assertEquals(client.getBirthday().toString(), birthday.toString());
		Assert.assertEquals(client.getAvatarFilePath(), "C:/resources/ProfilesPhotos/UsernameFigo");
		Assert.assertEquals(client.getAddresses().toString(), addresses.toString());
	}
	
	@Test	
	public void testSetter(){
		
		List<Address> addresses = new ArrayList<Address>();
		addresses.add(new Address("Italy", "Bologna", "64100", "Via del Risorgimento", "2"));
		
		LocalDate birthday = new LocalDate.of(2000, 1, 8);
		client.setUsername("UsernameFigo");
		Assert.assertEquals(client.getUsername(), "UsernameFigo");
		client.setEmail("enrica.dentiera@studio.unibo.it");
		Assert.assertEquals(client.getEmail(), "enrica.dentiera@studio.unibo.it");
		client.setPassword("Password");
		Assert.assertEquals(client.getPassword(), "Password");
		client.setFirstName("Enrica");
		Assert.assertEquals(client.getFirstName(), "Enrica");
		client.setLastName("Dentiera");
		Assert.assertEquals(client.getLastName(), "Dentiera");
		LocalDate birthday = new LocalDate.of(2000, 1, 8);
		client.setBirthday(birthday);
		Assert.assertEquals(client.getBirthday().toString(), birthday.toString());
		client.setAvatarFilePath("C:/resources/ProfilesPhotos/UsernameFigo")
		Assert.assertEquals(client.getAvatarFilePath(), "C:/resources/ProfilesPhotos/UsernameFigo");
		client.setAddresses(addresses);
		Assert.assertEquals(client.getAddresses().toString(), addresses.toString());
	}
}