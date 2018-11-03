package gittest;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class gittesttest {

	@Test
	  public void testToDouble() {
	    int actual = hello.toDouble(10);
	    int expect = 20;
	    assertThat(actual, is(expect));
	  }
//	void test() {
//		fail("まだ実装されていません");
//	}

}
