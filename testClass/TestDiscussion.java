public class TestDiscussionRequest {

    private DiscussionRequest discussionRequest;

    @Before
    public void setUp() {
        this.discussionRequest = new DiscussionRequest();
    }

    @Test
    public void testCostruttore(){
        Assert.assertNull(discussionRequest.getText());
        Assert.assertNull(discussionRequest.getDiscussion());
        Assert.assertNull(discussionRequest.getDiscussionResult());
    }
    
    @Test
    public void testGetter(){
        String text = "Refund for wrong print";
        Causal causal = new Causal(UUID.randomUUID(),text);
        ArrayList<Causal> causals = new ArrayList<Causal>();
        causals.add(causal);
        Judgement judgement = Judgment.PRO_CLIENT; 
        Discussion discussion = new Discussion(UUID.randomUUID(),text,causals);
        DiscussionResult discussionResult = new DiscussionResult(UUID.randomUUID(),20,judgement);
        DiscussionRequest discussionRequest = new DiscussionRequest(null,text,discussion,discussionResult);
        Assert.assertEquals(discussionRequest.getText(),text);
        Assert.assertEquals(discussionRequest.getDiscussion(),discussion);
        Assert.assertEquals(discussionRequest.getDiscussionResult(),discussionResult);
    }

    @Test
    public void testSetter(){
        String text = "Refund for wrong print";
        Causal causal = new Causal(UUID.randomUUID(),text);
        ArrayList<Causal> causals = new ArrayList<Causal>();
        causals.add(causal);
        Judgement judgement = Judgment.PRO_CLIENT; 
        Discussion discussion = new Discussion(UUID.randomUUID(),text,causals);
        DiscussionResult discussionResult = new DiscussionResult(UUID.randomUUID(),20,judgement);
        discussionRequest.setText(text);
        Assert.assertEquals(discussionRequest.getText(),text);
        discussionRequest.setDiscussion(discussion);
        Assert.assertEquals(discussionRequest.getDiscussion(),discussion);
        discussionRequest.setDiscussionResult(discussionResult);
        Assert.assertEquals(discussionRequest.getDiscussionResult(),discussionResult);
	}
}