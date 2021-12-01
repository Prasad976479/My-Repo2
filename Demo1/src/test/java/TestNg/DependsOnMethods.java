package TestNg;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DependsOnMethods {


@Test(dependsOnMethods="Second",priority=2)
public void first() {
	System.out.println("A");
}
@Test
public void Second() {
	System.out.println("B");
}

@Test(dependsOnMethods="Fourth",priority=1)
public void Third()  {
	System.out.println("C");
}
@Test
public void Fourth() {
	System.out.println("D");
}
}