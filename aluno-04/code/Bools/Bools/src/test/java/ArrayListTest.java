import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ArrayListTest {
	
	private ArrayList<String> fifthHarmony;
	
	@Before
	public void setUp() {
		fifthHarmony = new ArrayList<String>();
	}

	@After
	public void tearDown() {
		fifthHarmony.clear();
	}  

	@Test
	public void addSingerTest(){ //Test Add(E element)
		//Adicionando uma integrante
		fifthHarmony.add("Lauren");
		assertFalse(fifthHarmony.isEmpty());
		assertEquals("Tamanho certo",1,fifthHarmony.size());
		assertEquals("Cantora inserida com sucesso","Lauren",fifthHarmony.get(0));
		
		//Adicionando um membro nulo
		fifthHarmony.add(null);
		assertEquals("Tamanho certo",2,fifthHarmony.size());
		assertNull("Null inserido",fifthHarmony.get(1)); 	
		
		//Adicionando uma string vazia
		fifthHarmony.add("");
		assertEquals("Tamanho certo",3,fifthHarmony.size());
		assertEquals("Vazio inserido","",fifthHarmony.get(2));	
	}
	
	@Test
	public void addSingerPositionTest(){ //Test Add(int index, E element)
		//Testando valores negativos
		try{
			fifthHarmony.add(-1, "Camila Cabello");
			fail("IndexOutOfBoundsException esperado");
		}catch(IndexOutOfBoundsException e){
			
		}
		
		//Testando os limites positivos
		try{
			fifthHarmony.add(Integer.MAX_VALUE, "Camila Cabello");
			fail("IndexOutOfBoundsException esperado");
		}catch(IndexOutOfBoundsException e){
			
		}
		
		//Testando valores extremamente pequenos
		try{
			fifthHarmony.add(Integer.MIN_VALUE, "Camila Cabello");	
			fail("IndexOutOfBoundsException esperado");		
		}catch(IndexOutOfBoundsException e){
			
		}
		
		//Testando index zero
		fifthHarmony.add(0, "Camila Cabello");
		assertEquals("Tamanho certo",1,fifthHarmony.size());
		assertEquals("Camila Cabello adicionada ao grupo","Camila Cabello",fifthHarmony.get(0));
		fifthHarmony.remove(0);	
		
		//TODO testar pulando um índice
	}
	
	@Test
	public void clearGroup(){ //Test Clear()
			
			fifthHarmony.clear();
			assertEquals("O grupo acabou!", 0,fifthHarmony.size());
			
			fifthHarmony.add(null);
			assertNotEquals("Tamanho errado",0,fifthHarmony.size());
			fifthHarmony.clear();

			fifthHarmony.add(0,"Lauren Jauregui");
			fifthHarmony.add(1,"Ally Brooke");
			fifthHarmony.add(2,"Normani Kordey");
			fifthHarmony.add(3,"Dinah Janne");
			fifthHarmony.add(4,"Camila Cabello");
			fifthHarmony.clear();
			assertEquals("O grupo acabou!", 0,fifthHarmony.size());
	}
	
	@Test
	public void containsGroup(){ //Test contains(Object o)
		fifthHarmony.add("Ally");
		assertTrue(fifthHarmony.contains("Ally"));
		assertEquals("Ally está contida no grupo","Ally",fifthHarmony.get(0));
		fifthHarmony.remove(0);
		
		fifthHarmony.add(null);
		assertTrue(fifthHarmony.contains(null));
		assertEquals("Nulo está contido no grupo",null,fifthHarmony.get(0));
		fifthHarmony.remove(0);
		
		fifthHarmony.add("");
		assertTrue(fifthHarmony.contains(""));
		assertEquals("Vazio está contido no grupo","",fifthHarmony.get(0));
		fifthHarmony.remove(0);
		
		assertFalse("Nulo não está presente antes dos demais",fifthHarmony.contains(null));	
	}
	
	@Test
	public void getGroup(){ //Test get(int index)		
		fifthHarmony.add(0,"Lauren Jauregui");
		fifthHarmony.add(1,"Ally Brooke");
		fifthHarmony.add(2,"Normani Kordey");
		fifthHarmony.add(3,"Dinah Janne");
		fifthHarmony.add(4,"Camila Cabello");
		
		//Testando valores negativos
		try{
			fifthHarmony.get(-1);
			fail("IndexOutOfBoundsException esperado");		
		}catch(IndexOutOfBoundsException e){
			
		}
		
		//Testando os valores extremamente grandes
		try{
			fifthHarmony.get(Integer.MAX_VALUE);
			fail("IndexOutOfBoundsException esperado");		
		}catch(IndexOutOfBoundsException e){
			
		}
		
		//Testando os limites positivos
		try{
			fifthHarmony.get(5);
			fail("IndexOutOfBoundsException esperado");		
		}catch(IndexOutOfBoundsException e){
			
		}
		
		//Testando valores extremamente pequenos
		try{
			fifthHarmony.get(Integer.MIN_VALUE);
			fail("IndexOutOfBoundsException esperado");					
		}catch(IndexOutOfBoundsException e){
			
		}
		
		//Verificando o método Get
		assertEquals("Pegando a Camila do grupo","Camila Cabello",fifthHarmony.get(4));
		assertEquals("Pegando a Lauren do grupo","Lauren Jauregui",fifthHarmony.get(0));
	}
	
	@Test
	public void isEmptyGroup(){ // Test isEmpty()
		assertTrue(fifthHarmony.isEmpty());
		fifthHarmony.add("Dinah Jane");
		assertFalse(fifthHarmony.isEmpty());
		fifthHarmony.remove(0);
		assertTrue(fifthHarmony.isEmpty());
	}
	
	@Test
	public void removeMemberPosition(){ //Test remove(int index)
		fifthHarmony.add(0,"Camila Cabello");
		assertEquals("Tamanho certo",1,fifthHarmony.size());
		fifthHarmony.remove(0);
		assertNotEquals("Tamanho errado",1,fifthHarmony.size());
		try{
			assertNotEquals("Camila foi removida do grupo com sucesso","Camila Cabello",fifthHarmony.get(0));
			fail("IndexOutOfBoundsException esperado");		
		}catch(IndexOutOfBoundsException e){
			
		}
	}
	
	@Test
	public void removeMember(){ // Test remove(Object o)		
		fifthHarmony.add(0,"Lauren Jauregui");
		fifthHarmony.add(1,"Ally Brooke");
		fifthHarmony.add(2,"Normani Kordey");
		fifthHarmony.add(3,"Dinah Janne");
		fifthHarmony.add(4,"Camila Cabello");
		
		fifthHarmony.remove((String) "Lauren Jauregui");
		assertEquals("A primeira integrante agora é Ally Brooke","Ally Brooke",fifthHarmony.get(0));
		assertEquals("Tamanho certo",4,fifthHarmony.size());
		assertFalse(fifthHarmony.contains((String) "Lauren Jauregui"));
		
		assertFalse(fifthHarmony.remove(null));
		
		
	}
	
	@Test
	public void sizeGroup(){ //Test size()
		assertEquals("Tamanho certo",0,fifthHarmony.size());
		assertNotEquals("Tamanho errado",-1,fifthHarmony.size());
	}
}
