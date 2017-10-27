import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class TestQueueLucas {

	private Queue queue;

	@Before
	public void setUp() {
		System.out.println("setUp:");
		queue = new Queue();
	}

	@After
	public void tearDown() {
		System.out.println("tearDown.\n\n");
		queue = null;
	}

	@Test
	public void testAdd() {
		
		// Adicionando elemento zero na fila
		assertTrue(queue.add((Integer)0));
		
		// Adicionando 1000 elementos inteiros positivos na fila
		for(int i = 1; i < 1000; i++) {
			assertTrue(queue.add((Integer)i));
		}
		
		// Adicionando 1000 elementos inteiros negativos na fila
		for(int i = -1000; i < -1; i++){
			assertTrue(queue.add((Integer)i));
		}
		
		// Adicionando elemento null: conforme a especificação isso é possível e não gera exceção
		assertTrue(queue.add(null));
		
		// Adicionando MAX INT e MIN INT
		assertTrue(queue.add(Integer.MAX_VALUE));
		assertTrue(queue.add(Integer.MIN_VALUE));
		
		// Testando se realmente o primeiro elemento da fila é o '0'
		Integer elemento = (Integer) queue.element();
		assertThat(elemento, is(0));

	}

	@Test
	public void testRemove() {

		Integer elemento;
		
		// Conforme a especificação, se a fila estiver vazia e o método remove() for chamado gera um NoSuchElementException!
		try {
			elemento = (Integer) queue.remove();
			fail("Não gerou NoSuchElementException!");

		} catch (NoSuchElementException ex) {
			System.out.println(ex.getMessage());
		}
		
		for (int i = -1000; i < 1000; i++) {
			assertTrue(queue.add((Integer) i));
		}
		
		// Removendo o primeiro elemento da fila, no caso o '-1000'
		elemento = (Integer) queue.remove();
		assertThat(elemento, is(-1000));
		
		// Removendo o primeiro elemento da fila, no caso agora o '-999'
		elemento = (Integer) queue.remove();
		assertThat(elemento, is(-999));

	}

	@Test
	public void testElement() {
		
		Integer elemento;
		// Testando se realmente gera a exceção NoSuchElementException!
		try {
			 elemento = (Integer) queue.element();
			fail("Não gerou NoSuchElementException!");

		} catch (NoSuchElementException ex) {
			System.out.println(ex.getMessage());
		}
		
		queue.add(null);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		// Testando se realmente o elemento do inicio da fila é o null
		elemento = (Integer) queue.element();
		assertThat(elemento, is((Object)null));
		
		// Removendo o null
		assertThat(queue.remove(), is((Object)null));
		
		// Testando se agora o elemento do inicio é o '1'
		elemento = (Integer) queue.element();
		assertThat(elemento, is(1));
		

	}

}
