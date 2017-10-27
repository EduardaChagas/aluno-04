import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.ufal.ic.atividades.teste.BooleanArrayAsList;
import br.ufal.ic.atividades.teste.Bools;

public class BooleanArrayAsListTest {
	
	private boolean[] array;
	private BooleanArrayAsList booleanArray;
	
	@Before
	public void setUp() {
		array = new boolean[3];
		booleanArray = new BooleanArrayAsList(array,0,array.length);
	}

	@Test(expected = NullPointerException.class)
	public void sizeTest(){ // Test size()
		
		assertEquals("Tamanho correto!",3, booleanArray.size());
		
		array = new boolean[5];
		booleanArray = new BooleanArrayAsList(array,0,array.length);
		assertEquals("Tamanho correto!",5, booleanArray.size());
		
		array = new boolean[0];
		booleanArray = new BooleanArrayAsList(array,0,array.length);
		assertEquals("Tamanho correto!",0, booleanArray.size());
		

		//Expected nullPointerException
		array = null;
		booleanArray = new BooleanArrayAsList(array,0,array.length);
		assertEquals("Tamanho do array nulo!",0, booleanArray.size());
		
	}

	//@Test
//	public void isEmptyTest(){ //Test isEmpty()	
		
					
	//}
	
	@Test(expected = NullPointerException.class)
	public void getTest(){ //Test get(int index) 

		//Expected nullPointerException
		array = null;
		booleanArray = new BooleanArrayAsList(array,0,array.length);
		assertEquals("Get não está funcionando para null",false,booleanArray.get(0));
		
		//Caso base
		booleanArray = new BooleanArrayAsList(array,0,array.length);
		assertEquals("Get está funcionando",false,booleanArray.get(0));
		
		array[0] = true;
		booleanArray = new BooleanArrayAsList(array,0,array.length);
		assertEquals("Get funcionando",true,booleanArray.get(0));
		
		array[1] = false;
		booleanArray = new BooleanArrayAsList(array,0,array.length);
		assertEquals("Get funcionando",false,booleanArray.get(0));
		
		array[2] = true;
		booleanArray = new BooleanArrayAsList(array,0,array.length);
		assertEquals("Get funcionando",true,booleanArray.get(0));
		
	}
	
	@Test(expected = NullPointerException.class)
	public void containsTest(){//Test contains(Object target)
		
		array[0] = true;
		booleanArray = new BooleanArrayAsList(array,0,array.length);
		assertEquals("Contains funcionando",true,booleanArray.contains(true));
		
		array[1] = false;
		booleanArray = new BooleanArrayAsList(array,0,array.length);
		assertEquals("Contains funcionando",true,booleanArray.contains(false));
		
		array[0] = false;
		booleanArray = new BooleanArrayAsList(array,0,array.length);
		assertEquals("Contains funcionando",false,booleanArray.contains(true));
		
		//Expected nullPointerException
		array = null;
		booleanArray = new BooleanArrayAsList(array,0,array.length);
		assertEquals("Contains não está funcionando para null",true,booleanArray.contains(null));
		
	}
	
	@Test(expected = NullPointerException.class)
	public void indexOfTest(){//Test indexOf(Object target) 
		
		//Expected nullPointerException
		array = null;
		booleanArray = new BooleanArrayAsList(array,0,array.length);
		assertEquals("IndexOf não está funcionando para null",0,booleanArray.indexOf(true));
		assertEquals("IndexOf não está funcionando para null",0,booleanArray.indexOf(false));
		assertEquals("IndexOf não está funcionando para null",0,booleanArray.indexOf(null));
		
		array[0] = true;
		array[1] = false;
		array[2] = true;
		array[3] = false;
		booleanArray = new BooleanArrayAsList(array,0,array.length);
		assertEquals("IndexOf está funcionando",0,booleanArray.indexOf(true));
		assertEquals("IndexOf está funcionando",1,booleanArray.indexOf(false));
		assertEquals("IndexOf está funcionando",2,booleanArray.indexOf(true));
		assertEquals("IndexOf está funcionando",3,booleanArray.indexOf(false));		
	}
	
	@Test(expected = NullPointerException.class)
	public void lastIndexOfTest(){//Test lastIndexOf(Object target)

		//Expected nullPointerException
		array = null;
		booleanArray = new BooleanArrayAsList(array,0,array.length);
		assertNotEquals("O elemento não está contido no array nulo",0, booleanArray.lastIndexOf(null));
		assertNotEquals("O elemento não está contido no array nulo",0, booleanArray.lastIndexOf(true));
		assertNotEquals("O elemento não está contido no array nulo",0, booleanArray.lastIndexOf(false));
		
		array[0] = true;
		array[1] = true;
		array[2] = true;
		array[3] = false;
		array[4] = false;
		array[5] = false;
		booleanArray = new BooleanArrayAsList(array,0,array.length);		
		assertEquals("Indíce correto", 2, booleanArray.lastIndexOf(true));
		assertEquals("Indíce correto", 5, booleanArray.lastIndexOf(false));
		
		array[6] = true;
		array[7] = false;
		booleanArray = new BooleanArrayAsList(array,0,array.length);		
		assertEquals("Indíce correto", 6, booleanArray.lastIndexOf(true));
		assertEquals("Indíce correto", 7, booleanArray.lastIndexOf(false));		
	}
	
	@Test
	public void setTest(){ //Test set(int index, Boolean element)

		assertEquals("Valores corretos",booleanArray.get(0),booleanArray.set(0,true));
		assertEquals("Valores corretos",true,booleanArray.set(0,true));
		assertEquals("Valores corretos",booleanArray.get(1),booleanArray.set(1,false));
		assertEquals("Valores corretos",false,booleanArray.set(1,false));
		assertEquals("Valores corretos",booleanArray.get(2),booleanArray.set(2,true));
		assertEquals("Valores corretos",true,booleanArray.set(2,true));
	
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void subListTest(){ //Test subList(int fromIndex, int toIndex)
		
		assertEquals("Função não codificada!",true,booleanArray.subList(0, 1));
		assertEquals("Função não codificada!",true,booleanArray.subList(0, 2));
		assertEquals("Função não codificada!",true,booleanArray.subList(0, 3));
		
	}
	
	@Test
	public void equalsTest(){ //Test equals(Object object)
		
		array[0] = false;
		array[1] = false;
		array[2] = false;
		booleanArray = new BooleanArrayAsList(array,0,array.length);
		assertEquals("Valores diferentes de true na lista",false,booleanArray.equals(true));
		
		array[0] = true;
		array[1] = true;
		array[2] = true;
		booleanArray = new BooleanArrayAsList(array,0,array.length);
		assertEquals("Valores diferentes de false na lista",false,booleanArray.equals(true));
		
		array[0] = true;
		array[1] = false;
		array[2] = true;
		booleanArray = new BooleanArrayAsList(array,0,array.length);
		assertEquals("Valores diferentes de false na lista",false,booleanArray.equals(true));
		
		
	}
	
	
	
}
