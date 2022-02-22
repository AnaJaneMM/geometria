/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public static Test suite()
{
	TestSuite suite  = new TestSuite("suiteRaiz");
	suite.addTest(new TestSuite(MiVectorTest.class));
	...
	return suite;
}
...
public static void main (String[] args)
{
	junit.swingui.TestRunner.run(GeometriaTest.class);
}