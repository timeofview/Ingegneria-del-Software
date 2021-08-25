public class TestOrder {

    private Order order;

    @Before
    public void setUp() {
        this.order = new order();
    }

    @Test
    public void testCostruttore(){
        Assert.assertNull(order.getCreationDateTime());
        Assert.assertNull(order.getProductionStartDateTime());
        Assert.assertNull(order.getShippingStartDateTime());
        Assert.assertNull(order.getShippingEndDateTime());
        Assert.assertNull(order.getStatus());
        Assert.assertNull(order.getClient());
        Assert.assertNull(order.getProducer());
        Assert.assertNull(order.getFeedback());
        Assert.assertNull(order.getDiscussion());
        Assert.assertNull(order.getPayment());  
    }
    
    @Test
    public void testGetter(){
        LocalDate creationDateTime = new LocalDate.of(2020, 8, 1);
        LocalDate productionStartDateTime = new LocalDate.of(2020, 8, 10);
        LocalDate shippingStartDateTime = new LocalDate.of(2000, 8, 15);
        LocalDate shippingEndDateTime = new LocalDate.of(2000, 8, 20);
        LocalDate activatedDateTime = new LocalDate.of(2019, 8, 10);
        LocalDate suspendedDateTime;
        List<Address> addressesClient = new ArrayList<Address>();
		    addressesClient.add(new Address("Italy", "Bologna", "64100", "Via del Risorgimento", "3"));
        List<Address> addressesProducer = new ArrayList<Address>();
		    addressesProducer.add(new Address("Italy", "Bologna", "64100", "Via del Risorgimento", "4"));
        Status status = new Status.Pending;
        Client client = new Client("UsernameFigo", "Password" , "enrica.dentiera@studio.unibo.it", "Enrica",
			"Dentiera", birthday, "C:/resources/ProfilesPhotos/UsernameFigo", addresses);
        Producer producer = new Producer("UsernameBello", "Password" , "mark.lock@studio.unibo.it", activatedDateTime,
            suspendedDateTime, "Mark", "Lock", birthday, "C:/resources/ProfilesPhotos/UsernameBello", addresses);
        Feedback feedback;
        Discussion discussion;
        LocalDateTime timeStamp = new LocalDateTime.of(20, 8, 1, 19, 30, 40);
        UUID uuid = UUID.randomUUID();
        Payment payment = new Payment(null,timeStamp, 10, 100, 22, 2, client, producer);
        Order order = new Order(uuid,creationDateTime,productionStartDateTime,shippingStartDateTime,shippingEndDateTime,status,client,producer,feedback,discussion,payment);
        Assert.assertEquals(order.getCreationDateTime(),creationDateTime);
        Assert.assertEquals(order.getProductionStartDateTime(),productionStartDateTime);
        Assert.assertEquals(order.getShippingStartDateTime(),shippingStartDateTime);
        Assert.assertEquals(order.getShippingEndDateTime(),shippingEndDateTime);
        Assert.assertEquals(order.getStatus(),status);
        Assert.assertEquals(order.getClient(),client);
        Assert.assertEquals(order.getProducer(),producer);
        Assert.assertEquals(order.getFeedback(),feedback);
        Assert.assertEquals(order.getDiscussion(),discussion);
        Assert.assertEquals(order.getPayment(),payment);
    }

    @Test
    public void testSetter(){
        LocalDate creationDateTime = new LocalDate.of(2020, 8, 1);
        LocalDate productionStartDateTime = new LocalDate.of(2020, 8, 10);
        LocalDate shippingStartDateTime = new LocalDate.of(2000, 8, 15);
        LocalDate shippingEndDateTime = new LocalDate.of(2000, 8, 20);
        LocalDate activatedDateTime = new LocalDate.of(2019, 8, 10);
        LocalDate suspendedDateTime;
        List<Address> addressesClient = new ArrayList<Address>();
		    addressesClient.add(new Address("Italy", "Bologna", "64100", "Via del Risorgimento", "3"));
        List<Address> addressesProducer = new ArrayList<Address>();
		    addressesProducer.add(new Address("Italy", "Bologna", "64100", "Via del Risorgimento", "4"));
        Status status = new Status.Pending;
        Client client = new Client("UsernameFigo", "Password" , "enrica.dentiera@studio.unibo.it", "Enrica",
			"Dentiera", birthday, "C:/resources/ProfilesPhotos/UsernameFigo", addresses);
        Producer producer = new Producer("UsernameBello", "Password" , "mark.lock@studio.unibo.it", activatedDateTime,
            suspendedDateTime, "Mark", "Lock", birthday, "C:/resources/ProfilesPhotos/UsernameBello", addresses);
        Feedback feedback;
        Discussion discussion;
        LocalDateTime timeStamp = new LocalDateTime.of(20, 8, 1, 19, 30, 40);
        UUID uuid = UUID.randomUUID();
        Payment payment = new Payment(null,timeStamp, 10, 100, 22, 2, client, producer);
        order.setCreationDateTime(creationDateTime);
        Assert.assertEquals(order.getCreationDateTime(),creationDateTime);
        order.setproductionStartDateTime(productionStartDateTime);
        Assert.assertEquals(order.getProductionStartDateTime(),productionStartDateTime);
        order.setShippingStartDateTime(shippingStartDateTime);
        Assert.assertEquals(order.getShippingStartDateTime(),shippingStartDateTime);
        order.setShippingEndDateTime(shippingEndDateTime);
        Assert.assertEquals(order.getShippingEndDateTime(),shippingEndDateTime);
        order.setStatus(status);
        Assert.assertEquals(order.getStatus(),status);
        order.setClient(client);
        Assert.assertEquals(order.getClient(),client);
        order.setProducer(producer);
        Assert.assertEquals(order.getProducer(),producer);
        order.setFeedback(feedback);
        Assert.assertEquals(order.getFeedback(),feedback);
        order.setDiscussion(discussion);
        Assert.assertEquals(order.getDiscussion(),discussion);
        order.setPayment(payment)
        Assert.assertEquals(order.getPayment(),payment);
	}
}