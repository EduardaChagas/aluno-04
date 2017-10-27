package br.ufal.ic;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import br.ufal.ic.main.JuliaQueue;

public class JuliaQueueTest {
	
	private JuliaQueue<Integer> fila;

	@Before
	public void setUp(){
		fila = new JuliaQueue<Integer>(3);
	}

	@Test
	public void pushTest() {
		boolean result; 		
		try {
			//Testando a saída da função push
			result = fila.push(1);
			assertTrue(result);
			//Testando a inserção do null
			result = fila.push(null);
			assertTrue(result);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		//Testando o IndexOutOfBoundsException
		try {
			fila.push(3);
			fila.push(4);
			fail("IndexOutOfBoundsException esperado");
		} catch (Exception e) {
			//e.printStackTrace();			
		}
	}

	@Test
	public void sizeTest() {
		int result,size;
		//Testando a fila vazia
		result = fila.size();
		size = 0;
		assertEquals(size,result);
		//Inserindo elementos
		try {
			fila.push(1);
			fila.push(2);
			fila.push(null);
			result = fila.size();
			size = 3;
			assertEquals(size,result);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		//Inserindo mais elementos que o permitido pela fila
		try {
			fila.push(4);
			result = fila.size();
			size = 4;
			assertEquals(size,result);
			fail("IndexOutOfBoundsException esperado");
		} catch (Exception e) {
			//e.printStackTrace();
		}		
	}
	
	@Test
	public void removeTest() {
		Integer result,a;
		try{
			fila.remove();
			fail("NullPointerException esperado");
		} catch (Exception e) {
			//e.printStackTrace();			
		}
		try {
			fila.push(1);
			fila.push(2);
			a = 1;
			result = fila.remove();		
			//O código devolveu um item inesperado, uma vez que devolveu null ao invés de 1
			assertEquals(a,result);
			//No entanto, agora o código devolve da maneira esperada
			result = fila.remove();
			assertEquals(a,result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void popTest(){
		Integer result,element;
		try {
			//Testando a fila vazia
			result = fila.pop();
			assertNull(result);
			//Inserindo um elemento
			fila.push(1);
			result = fila.pop();
			element = 1;
			//Outro erro foi encontrado no código, pois este deveria retornar 1 mas devolveu null
			assertNotNull(result);
			assertEquals(element,result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
