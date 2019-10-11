public class TestClass extends TestSuite {
    @Override
    protected void testList() {
        testIntPassed();
        testIntFailled();
        testBoleanPassed();
        testBoleanFailled();
        testDoublePassed();
        testDoubleFailled();
    }

    private void testDoublePassed() {
        double result = 5.0;
        assertEquals(5.0,result);
    }
    private void testDoubleFailled(){

    assertEquals(4.0,3.0);
    }

    public void testIntPassed(){
        int result = 5;
        assertEquals(5,result);

    }
    public void testIntFailled(){
        assertEquals(3,7);
    }
    public void testBoleanPassed() {
        assertEquals(true, true);
    }
    public void testBoleanFailled() {
        assertEquals(true,false);
    }

}
