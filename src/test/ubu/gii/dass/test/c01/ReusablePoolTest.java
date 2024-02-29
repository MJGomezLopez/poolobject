/**
* 
*/
package ubu.gii.dass.test.c01;
 
import static org.junit.Assert.*;
 
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
 
import ubu.gii.dass.c01.Client;
import ubu.gii.dass.c01.DuplicatedInstanceException;
import ubu.gii.dass.c01.NotFreeInstanceException;
import ubu.gii.dass.c01.Reusable;
import ubu.gii.dass.c01.ReusablePool;
 
/**
* @author Jon Ander Incera Moreno
* @author Miguel José Gómez López
*
*/
public class ReusablePoolTest {
	private ReusablePool pool;
 
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		pool = ReusablePool.getInstance();
	}
 
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		pool = null;
	}
 
	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#getInstance()}.
	 */
	@Test
	public void testGetInstance() {
		ReusablePool pool = ReusablePool.getInstance();
		Assert.assertNotNull(pool);
		Assert.assertTrue(pool instanceof ReusablePool);
	}
 
	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#acquireReusable()}.
	 * @throws NotFreeInstanceException 
	 */
	@Test(expected = NotFreeInstanceException.class)
	public void testAcquireReusable() throws NotFreeInstanceException {
		Reusable r1 = pool.acquireReusable();
		Assert.assertNotNull(r1);
		Assert.assertTrue(r1 instanceof Reusable);
		String mensaje = r1.util();
		Assert.assertTrue(mensaje instanceof String);
		Reusable r2 = pool.acquireReusable();
		Reusable r3 = pool.acquireReusable();
	}
 
	/**
	 * Test method for {@link ubu.gii.dass.c01.ReusablePool#releaseReusable(ubu.gii.dass.c01.Reusable)}.
	 * @throws NotFreeInstanceException 
	 * @throws DuplicatedInstanceException 
	 */
	@Test(expected = DuplicatedInstanceException.class)
	public void testReleaseReusable() throws NotFreeInstanceException, DuplicatedInstanceException {
		Reusable r2 = pool.acquireReusable();
		pool.releaseReusable(r2);
		pool.releaseReusable(r2);
	}
 
}
