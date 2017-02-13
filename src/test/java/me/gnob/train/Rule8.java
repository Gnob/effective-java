package me.gnob.train;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Rule8
 *
 * @author SangBong Lee
 * @version 2.0.0
 * @since 2017. 02. 13.
 */
public class Rule8 {
	@Test
	public void testIntegerEquals() throws Exception {
		Integer foo = new Integer(1);
		Integer bar = new Integer(1);

		assertThat(foo == bar, is(false));
		assertThat(foo.equals(bar), is(true));
	}

	public void shouldNotEqual() {
		final int x = 1;
		final int y = 2;

		BadPoint pointA = new BadPoint(x, y);
		BadPoint pointB = new BadPoint(x, y);

		assertThat(pointA == pointB, is(false));
		assertThat(pointA.equals(pointB), is(false));
		assertThat(pointA.getX() == pointB.getX() && pointA.getY() == pointB.getY(), is(true));
	}

	public void shouldEqual() {
		final int x = 1;
		final int y = 2;

		Point pointA = new Point(x, y);
		Point pointB = new Point(x, y);

		assertThat(pointA == pointB, is(false));
		assertThat(pointA.equals(pointB), is(false));
	}
}
