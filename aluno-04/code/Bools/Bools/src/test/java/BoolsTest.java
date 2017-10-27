import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import br.ufal.ic.atividades.teste.BooleanArrayAsList;
import br.ufal.ic.atividades.teste.Bools;

public class BoolsTest {
	
	private boolean[] array;

	@Before
	public void setUp() {
		array = null;
	}
	
	@Test
	public void compareTest(){ //Test compare(boolean a, boolean b)
		
		assertEquals("Compara��o deu certo", 0,Bools.compare(true, true));
		assertNotEquals("Compara��o realmente n�o devolve este valor",-1,Bools.compare(true, true));
		assertNotEquals("Compara��o realmente n�o devolve este valor",1,Bools.compare(true, true));
		
		assertEquals("Compara��o deu certo",1,Bools.compare(true, false));
		assertNotEquals("Compara��o realmente n�o devolve este valor",0,Bools.compare(true, false));
		assertNotEquals("Compara��o realmente n�o devolve este valor",-1,Bools.compare(true, false));
		
		assertEquals("Compara��o deu certo",-1,Bools.compare(false, true));
		assertNotEquals("Compara��o realmente n�o devolve este valor",0,Bools.compare(false, true));
		assertNotEquals("Compara��o realmente n�o devolve este valor",1,Bools.compare(false, true));
		
		assertEquals("Compara��o deu certo",0,Bools.compare(false, false));		
		assertNotEquals("Compara��o realmente n�o devolve este valor",1,Bools.compare(false, false));
		assertNotEquals("Compara��o realmente n�o devolve este valor",-1,Bools.compare(false, false));		
	}
	
	@Test(expected = NullPointerException.class)
	public void containsTest(){ //Test contains(boolean[] array, boolean target)
		
		//Expected nullPointerException
		assertFalse("O elemento n�o est� contido no array nulo", Bools.contains(array, false));
		assertTrue("O elemento n�o est� contido no array nulo", Bools.contains(array, true));		
		
		array[0] = true;
		array[1] = true;
		assertTrue("O elemento est� contido no array",Bools.contains(array, true));
		assertFalse("O elemento n�o est� contido no array", Bools.contains(array, false));
		
		array[1] = false;
		assertTrue("O elemento est� contido no array", Bools.contains(array, false));
		assertTrue("O elemento est� contido no array", Bools.contains(array, true));
		
		array[0] = false;
		assertTrue("O elemento est� contido no array",Bools.contains(array, false));
		assertFalse("O elemento n�o est� contido no array", Bools.contains(array, true));
	}
	
	@Test(expected = NullPointerException.class)
	public void indexOfTest(){ // Test indexOf(boolean[] array, boolean target)
		
		//Expected nullPointerException
		assertNotEquals("O elemento n�o est� contido no array nulo",0, Bools.indexOf(array, false));
		assertNotEquals("O elemento n�o est� contido no array nulo",0, Bools.indexOf(array, true));
		
		array[0] = true;
		array[1] = false;
		array[2] = true;
		array[3] = false;
		
		assertEquals("Ind�ce correto", 0, Bools.indexOf(array, true));
		assertEquals("Ind�ce correto", 1, Bools.indexOf(array, false));
		assertEquals("Ind�ce correto", 2, Bools.indexOf(array, true));
		assertEquals("Ind�ce correto", 3, Bools.indexOf(array, false));		
		
	}
	
	@Test(expected = NullPointerException.class)
	public void indexOfTest2(){ // Test indexOf(boolean[] array, boolean[] target) 
		
		//Expected nullPointerException
		assertNotEquals("O elemento n�o est� contido no array nulo",0, Bools.indexOf(array, false));
		assertNotEquals("O elemento n�o est� contido no array nulo",0, Bools.indexOf(array, true));
		assertNotEquals("O elemento n�o est� contido no array nulo",0, Bools.indexOf(array, array));
		assertNotEquals("O elemento n�o est� contido no array nulo",0, Bools.indexOf(array, array));
		
		array[0] = true;
		array[1] = true;
		array[2] = true;
		array[3] = false;
		array[4] = false;
		array[5] = false;
		
		boolean[] array2 = null;
		
		array2[0] = true;
		array2[1] = false;
		assertEquals("Ind�ce correto", 2, Bools.indexOf(array, array2));

		array2[0] = true;
		array2[1] = true;
		assertEquals("Ind�ce correto", 0, Bools.indexOf(array, array2));
		assertEquals("Ind�ce correto",1,Bools.indexOf(array, array2));
		
		array2[0] = false;
		array2[1] = false;
		assertEquals("Ind�ce correto", 3, Bools.indexOf(array, array2));
		assertEquals("Ind�ce correto",4,Bools.indexOf(array, array2));
		
		array2[0] = false;
		array2[1] = true;
		assertEquals("N�o existe este subconjunto", -1, Bools.indexOf(array, array2));		
	}
	
	@Test(expected = NullPointerException.class)
	public void lastIndexOfTest(){ //Test lastIndexOf(boolean[] array, boolean target)
		
		//Expected nullPointerException
		assertNotEquals("O elemento n�o est� contido no array nulo",0, Bools.lastIndexOf(array, false));
		assertNotEquals("O elemento n�o est� contido no array nulo",0, Bools.lastIndexOf(array, true));
		
		array[0] = true;
		array[1] = true;
		array[2] = true;
		array[3] = false;
		array[4] = false;
		array[5] = false;
		
		assertEquals("Ind�ce correto", 2, Bools.indexOf(array, true));
		assertEquals("Ind�ce correto", 5, Bools.indexOf(array, false));
		
		array[6] = true;
		array[7] = false;
		
		assertEquals("Ind�ce correto", 6, Bools.indexOf(array, true));
		assertEquals("Ind�ce correto", 7, Bools.indexOf(array, false));		
	}
	
	@Test(expected = NullPointerException.class)
	public void concatTest(){ //Test concat(boolean[]... arrays) 
		
		boolean[] array2 = null;
		
		//Expected nullPointerException
		assertNotEquals("Concatenando nulls",0, Bools.concat(array,array2));
		
		array[0] = true;
		array[1] = false;
		
		array2[0] = true;
		array2[1] = false;
		
		boolean[] array3 = {true,false,true,false};
		assertEquals("Concatena��o deu certo",array3,Bools.concat(array,array2));
		
		//Expected nullPointerException
		assertNotEquals("Concatenando nulls",0, Bools.concat(array,null));
		assertNotEquals("Concatenando nulls",0, Bools.concat(null,array2));
	}
	
	@Test
	public void toArrayTest(){ //toArray(Collection<Boolean> collection)
		
		boolean[] array2 = new boolean[2];
        BooleanArrayAsList booleanArrayAsList = new BooleanArrayAsList(array2, 0, (-1));

        try {
            Bools.toArray(booleanArrayAsList);
            fail("IllegalArgumentException esperado");

        } catch(IllegalArgumentException e) {
        	
        }

        boolean[] array3 = new boolean[2];
        BooleanArrayAsList booleanArrayAsList1 = new BooleanArrayAsList(array3, 3, 3);

        try {
            Bools.toArray(booleanArrayAsList1);
            fail("ArrayIndexOutOfBoundsException esperado");

        } catch(ArrayIndexOutOfBoundsException e) {

        }		
	}
	
	@Test
	public void asListTest(){ //Test asList(boolean... backingArray)
		
		ArrayList<Boolean> list = new ArrayList<Boolean>();
		
		assertNotEquals("N�o adicionando nada na lista",null, Bools.asList());
		assertEquals("N�o adicionado nada na lista", list,Bools.asList());
		
		list.add(true);
		list.add(false);
		
		assertEquals("Adicionado corretamente na lista",list,Bools.asList(true,false));
		
		list.remove(1);
		assertEquals("Adicionado corretamente na lista",list,Bools.asList(true));		
		
	}
	
	@Test(expected = NullPointerException.class)
	public void countTrueTest(){//Test countTrue(boolean... values)
		
		//Expected nullPointerException
		assertNotEquals("Sem contagem de trues em null",0, Bools.countTrue(array));
		
		array[0] = true;
		array[1] = true;
		array[2] = true;		
		assertEquals("Contagem de trues correta",3,Bools.countTrue(array));
		
		array[0] = false;
		array[1] = false;
		array[2] = false;		
		assertEquals("Contagem de trues correta",0,Bools.countTrue(array));
		
	}
	
	@Test(expected = NullPointerException.class)
	public void checkNotNullTest(){ // Test checkNotNull(T reference)
		
		array[0] = true;
		array[1] = false;
		
		//Expected nullPointerException
		assertEquals("Checando corretamente",null,Bools.checkNotNull(null));
		
		assertEquals("Checando corretamente", true,Bools.checkNotNull(true));
		assertEquals("Checando corretamente", false,Bools.checkNotNull(false));
		assertEquals("Checando corretamente", array,Bools.checkNotNull(array));
		
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void checkElementIndexTest(){ //Test checkElementIndex(int index, int size, String desc)
		
		assertEquals("Ind�ce 0",0,Bools.checkElementIndex(0, 10, "desc"));
		
		//Expected IndexOutOfBoundsException
        assertEquals("Ind�ce inexistente",100,Bools.checkElementIndex(100, 10, "desc"));
        assertEquals("Ind�ce inexistente",-1,Bools.checkElementIndex(-1, 10, "desc"));
		
	}	

}
