import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        Queue queue0 = new Queue();
        try {
            java.lang.Object obj1 = queue0.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        Queue queue0 = new Queue();
        try {
            java.lang.Object obj1 = queue0.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.remove();
        try {
            java.lang.Object obj4 = queue0.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        Queue queue5 = new Queue();
        boolean b6 = queue0.add((java.lang.Object) queue5);
        try {
            java.lang.Object obj7 = queue5.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        java.lang.Object obj5 = queue0.remove();
        try {
            java.lang.Object obj6 = queue0.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "" + "'", obj5.equals(""));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.remove();
        try {
            java.lang.Object obj4 = queue0.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.remove();
        boolean b5 = queue0.add((java.lang.Object) 1.0d);
        java.lang.Object obj6 = queue0.remove();
        try {
            java.lang.Object obj7 = queue0.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0d + "'", obj6.equals(1.0d));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        java.lang.Object obj5 = queue0.remove();
        try {
            java.lang.Object obj6 = queue0.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        Queue queue5 = new Queue();
        boolean b7 = queue5.add((java.lang.Object) 1.0f);
        java.lang.Object obj8 = queue5.element();
        boolean b9 = queue0.add((java.lang.Object) queue5);
        java.lang.Object obj10 = queue5.remove();
        try {
            java.lang.Object obj11 = queue5.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1.0f + "'", obj10.equals(1.0f));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        Queue queue5 = new Queue();
        boolean b7 = queue5.add((java.lang.Object) 1.0f);
        java.lang.Object obj8 = queue5.element();
        boolean b9 = queue0.add((java.lang.Object) queue5);
        java.lang.Object obj10 = queue5.remove();
        try {
            java.lang.Object obj11 = queue5.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1.0f + "'", obj10.equals(1.0f));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) "");
        java.lang.Object obj6 = queue3.remove();
        boolean b7 = queue0.add((java.lang.Object) queue3);
        try {
            java.lang.Object obj8 = queue3.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        java.lang.Object obj5 = queue0.remove();
        try {
            java.lang.Object obj6 = queue0.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        Queue queue5 = new Queue();
        boolean b6 = queue0.add((java.lang.Object) queue5);
        try {
            java.lang.Object obj7 = queue5.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) "");
        java.lang.Object obj6 = queue3.remove();
        boolean b7 = queue0.add((java.lang.Object) queue3);
        java.lang.Object obj8 = queue0.element();
        java.lang.Object obj9 = queue0.element();
        java.lang.Object obj10 = queue0.remove();
        java.lang.Object obj11 = null;
        boolean b12 = queue0.add(obj11);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1.0f + "'", obj10.equals(1.0f));
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        Queue queue5 = new Queue();
        boolean b6 = queue0.add((java.lang.Object) queue5);
        Queue queue7 = new Queue();
        boolean b8 = queue0.add((java.lang.Object) queue7);
        try {
            java.lang.Object obj9 = queue7.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.remove();
        boolean b5 = queue0.add((java.lang.Object) 1.0d);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        java.lang.Object obj9 = queue6.element();
        java.lang.Object obj10 = queue6.element();
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) 1.0f);
        Queue queue14 = new Queue();
        boolean b16 = queue14.add((java.lang.Object) "");
        java.lang.Object obj17 = queue14.remove();
        boolean b18 = queue11.add((java.lang.Object) queue14);
        java.lang.Object obj19 = queue11.element();
        java.lang.Object obj20 = queue11.element();
        java.lang.Object obj21 = queue11.remove();
        java.lang.Object obj22 = queue11.element();
        boolean b23 = queue6.add(obj22);
        boolean b24 = queue0.add((java.lang.Object) b23);
        java.lang.Object obj25 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0f + "'", obj19.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 1.0f + "'", obj20.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1.0f + "'", obj21.equals(1.0f));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1.0d + "'", obj25.equals(1.0d));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.remove();
        try {
            java.lang.Object obj4 = queue0.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        boolean b6 = queue0.add((java.lang.Object) (short) -1);
        java.lang.Object obj7 = queue0.element();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) "");
        boolean b12 = queue8.add((java.lang.Object) (-1.0d));
        boolean b14 = queue8.add((java.lang.Object) (short) -1);
        java.lang.Object obj15 = queue8.element();
        boolean b16 = queue0.add((java.lang.Object) queue8);
        java.lang.Object obj17 = queue8.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) "");
        java.lang.Object obj6 = queue3.remove();
        boolean b7 = queue0.add((java.lang.Object) queue3);
        try {
            java.lang.Object obj8 = queue3.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        Queue queue4 = new Queue();
        boolean b6 = queue4.add((java.lang.Object) 1.0f);
        Queue queue7 = new Queue();
        boolean b9 = queue7.add((java.lang.Object) "");
        java.lang.Object obj10 = queue7.remove();
        boolean b11 = queue4.add((java.lang.Object) queue7);
        boolean b12 = queue0.add((java.lang.Object) queue7);
        try {
            java.lang.Object obj13 = queue7.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) "");
        java.lang.Object obj6 = queue3.remove();
        boolean b7 = queue0.add((java.lang.Object) queue3);
        java.lang.Object obj8 = queue0.remove();
        java.lang.Object obj9 = queue0.remove();
        try {
            java.lang.Object obj10 = queue0.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.remove();
        boolean b5 = queue0.add((java.lang.Object) 1.0d);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        boolean b10 = queue6.add((java.lang.Object) (-1.0d));
        boolean b12 = queue6.add((java.lang.Object) (short) -1);
        boolean b13 = queue0.add((java.lang.Object) queue6);
        java.lang.Object obj14 = queue6.remove();
        java.lang.Object obj15 = queue6.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (-1.0d) + "'", obj15.equals((-1.0d)));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj9 = queue6.remove();
        boolean b10 = queue0.add((java.lang.Object) queue6);
        boolean b12 = queue6.add((java.lang.Object) 1.0f);
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) 1.0f);
        java.lang.Object obj16 = queue13.element();
        Queue queue17 = new Queue();
        boolean b19 = queue17.add((java.lang.Object) 1.0f);
        Queue queue20 = new Queue();
        boolean b22 = queue20.add((java.lang.Object) "");
        java.lang.Object obj23 = queue20.remove();
        boolean b24 = queue17.add((java.lang.Object) queue20);
        boolean b25 = queue13.add((java.lang.Object) queue20);
        boolean b26 = queue6.add((java.lang.Object) b25);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1.0f + "'", obj16.equals(1.0f));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj9 = queue6.remove();
        boolean b11 = queue6.add((java.lang.Object) 1.0d);
        boolean b12 = queue0.add((java.lang.Object) queue6);
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) "");
        java.lang.Object obj16 = queue13.element();
        java.lang.Object obj17 = queue13.remove();
        boolean b18 = queue6.add((java.lang.Object) queue13);
        try {
            java.lang.Object obj19 = queue13.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        java.lang.Object obj5 = queue0.remove();
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        java.lang.Object obj9 = queue6.element();
        java.lang.Object obj10 = queue6.element();
        Queue queue11 = new Queue();
        boolean b12 = queue6.add((java.lang.Object) queue11);
        Queue queue13 = new Queue();
        boolean b14 = queue6.add((java.lang.Object) queue13);
        boolean b15 = queue0.add((java.lang.Object) b14);
        java.lang.Object obj16 = queue0.element();
        java.lang.Object obj17 = queue0.element();
        java.lang.Object obj18 = queue0.remove();
        Queue queue19 = new Queue();
        boolean b21 = queue19.add((java.lang.Object) "");
        java.lang.Object obj22 = queue19.element();
        java.lang.Object obj23 = queue19.element();
        Queue queue24 = new Queue();
        boolean b25 = queue19.add((java.lang.Object) queue24);
        java.lang.Object obj26 = queue19.element();
        java.lang.Object obj27 = queue19.element();
        java.lang.Object obj28 = queue19.remove();
        boolean b29 = queue0.add((java.lang.Object) queue19);
        Queue queue30 = new Queue();
        boolean b32 = queue30.add((java.lang.Object) 1.0f);
        java.lang.Object obj33 = queue30.element();
        java.lang.Object obj34 = queue30.element();
        java.lang.Object obj35 = queue30.remove();
        Queue queue36 = new Queue();
        boolean b38 = queue36.add((java.lang.Object) "");
        java.lang.Object obj39 = queue36.element();
        java.lang.Object obj40 = queue36.element();
        Queue queue41 = new Queue();
        boolean b42 = queue36.add((java.lang.Object) queue41);
        Queue queue43 = new Queue();
        boolean b44 = queue36.add((java.lang.Object) queue43);
        boolean b45 = queue30.add((java.lang.Object) b44);
        java.lang.Object obj46 = queue30.element();
        boolean b48 = queue30.add((java.lang.Object) 10L);
        Queue queue49 = new Queue();
        boolean b51 = queue49.add((java.lang.Object) "");
        java.lang.Object obj52 = queue49.element();
        java.lang.Object obj53 = queue49.element();
        java.lang.Object obj54 = queue49.remove();
        boolean b55 = queue30.add((java.lang.Object) queue49);
        Queue queue56 = new Queue();
        boolean b58 = queue56.add((java.lang.Object) 1.0f);
        java.lang.Object obj59 = queue56.remove();
        boolean b61 = queue56.add((java.lang.Object) 1.0d);
        Queue queue62 = new Queue();
        boolean b64 = queue62.add((java.lang.Object) "");
        boolean b66 = queue62.add((java.lang.Object) (-1.0d));
        boolean b68 = queue62.add((java.lang.Object) (short) -1);
        boolean b69 = queue56.add((java.lang.Object) queue62);
        java.lang.Object obj70 = queue56.element();
        boolean b71 = queue30.add((java.lang.Object) queue56);
        boolean b72 = queue19.add((java.lang.Object) queue56);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + true + "'", obj16.equals(true));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + true + "'", obj17.equals(true));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + true + "'", obj18.equals(true));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "" + "'", obj27.equals(""));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "" + "'", obj28.equals(""));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1.0f + "'", obj33.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1.0f + "'", obj34.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1.0f + "'", obj35.equals(1.0f));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "" + "'", obj39.equals(""));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "" + "'", obj40.equals(""));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + true + "'", obj46.equals(true));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + "" + "'", obj52.equals(""));
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + "" + "'", obj53.equals(""));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + "" + "'", obj54.equals(""));
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 1.0f + "'", obj59.equals(1.0f));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 1.0d + "'", obj70.equals(1.0d));
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) "");
        java.lang.Object obj6 = queue3.remove();
        boolean b7 = queue0.add((java.lang.Object) queue3);
        java.lang.Object obj8 = queue0.element();
        java.lang.Object obj9 = queue0.element();
        Queue queue10 = new Queue();
        boolean b12 = queue10.add((java.lang.Object) "");
        java.lang.Object obj13 = queue10.element();
        java.lang.Object obj14 = queue10.element();
        boolean b16 = queue10.add((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = queue10.element();
        boolean b18 = queue0.add((java.lang.Object) queue10);
        java.lang.Object obj19 = queue0.remove();
        java.lang.Object obj20 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0f + "'", obj19.equals(1.0f));
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        java.lang.Object obj5 = queue0.remove();
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        java.lang.Object obj9 = queue6.element();
        java.lang.Object obj10 = queue6.element();
        Queue queue11 = new Queue();
        boolean b12 = queue6.add((java.lang.Object) queue11);
        Queue queue13 = new Queue();
        boolean b14 = queue6.add((java.lang.Object) queue13);
        boolean b15 = queue0.add((java.lang.Object) b14);
        java.lang.Object obj16 = queue0.element();
        boolean b18 = queue0.add((java.lang.Object) 10L);
        Queue queue19 = new Queue();
        boolean b21 = queue19.add((java.lang.Object) "");
        java.lang.Object obj22 = queue19.element();
        java.lang.Object obj23 = queue19.element();
        java.lang.Object obj24 = queue19.remove();
        boolean b25 = queue0.add((java.lang.Object) queue19);
        Queue queue26 = new Queue();
        boolean b28 = queue26.add((java.lang.Object) 1.0f);
        java.lang.Object obj29 = queue26.remove();
        boolean b31 = queue26.add((java.lang.Object) 1.0d);
        Queue queue32 = new Queue();
        boolean b34 = queue32.add((java.lang.Object) "");
        boolean b36 = queue32.add((java.lang.Object) (-1.0d));
        boolean b38 = queue32.add((java.lang.Object) (short) -1);
        boolean b39 = queue26.add((java.lang.Object) queue32);
        java.lang.Object obj40 = queue26.element();
        boolean b41 = queue0.add((java.lang.Object) queue26);
        java.lang.Object obj42 = queue26.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + true + "'", obj16.equals(true));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1.0f + "'", obj29.equals(1.0f));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1.0d + "'", obj40.equals(1.0d));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1.0d + "'", obj42.equals(1.0d));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        Queue queue5 = new Queue();
        boolean b6 = queue0.add((java.lang.Object) queue5);
        java.lang.Object obj7 = queue0.element();
        java.lang.Object obj8 = queue0.element();
        java.lang.Object obj9 = queue0.remove();
        Queue queue10 = new Queue();
        boolean b12 = queue10.add((java.lang.Object) "");
        boolean b14 = queue10.add((java.lang.Object) (-1.0d));
        boolean b16 = queue10.add((java.lang.Object) (short) -1);
        java.lang.Object obj17 = queue10.element();
        boolean b18 = queue0.add((java.lang.Object) queue10);
        java.lang.Object obj19 = queue10.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "" + "'", obj8.equals(""));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "" + "'", obj19.equals(""));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) "");
        java.lang.Object obj6 = queue3.remove();
        boolean b7 = queue0.add((java.lang.Object) queue3);
        java.lang.Object obj8 = queue0.remove();
        java.lang.Object obj9 = queue0.remove();
        try {
            java.lang.Object obj10 = queue0.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = queue0.remove();
        java.lang.Object obj6 = queue0.remove();
        try {
            java.lang.Object obj7 = queue0.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "" + "'", obj5.equals(""));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1.0d) + "'", obj6.equals((-1.0d)));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        Queue queue5 = new Queue();
        boolean b6 = queue0.add((java.lang.Object) queue5);
        java.lang.Object obj7 = queue0.element();
        java.lang.Object obj8 = queue0.remove();
        java.lang.Object obj9 = queue0.remove();
        try {
            java.lang.Object obj10 = queue0.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "" + "'", obj8.equals(""));
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.remove();
        boolean b5 = queue0.add((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = queue0.remove();
        try {
            java.lang.Object obj7 = queue0.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte) 0 + "'", obj6.equals((byte) 0));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj9 = queue6.remove();
        boolean b10 = queue0.add((java.lang.Object) queue6);
        java.lang.Object obj11 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "" + "'", obj11.equals(""));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        Queue queue5 = new Queue();
        boolean b7 = queue5.add((java.lang.Object) 1.0f);
        java.lang.Object obj8 = queue5.element();
        boolean b9 = queue0.add((java.lang.Object) queue5);
        java.lang.Object obj10 = queue5.element();
        boolean b12 = queue5.add((java.lang.Object) "hi!");
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) "");
        java.lang.Object obj16 = queue13.element();
        boolean b18 = queue13.add((java.lang.Object) 1);
        Queue queue19 = new Queue();
        boolean b21 = queue19.add((java.lang.Object) 1.0f);
        java.lang.Object obj22 = queue19.remove();
        boolean b23 = queue13.add((java.lang.Object) queue19);
        boolean b24 = queue5.add((java.lang.Object) b23);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1.0f + "'", obj10.equals(1.0f));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1.0f + "'", obj22.equals(1.0f));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        java.lang.Object obj5 = queue0.remove();
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        java.lang.Object obj9 = queue6.element();
        java.lang.Object obj10 = queue6.element();
        Queue queue11 = new Queue();
        boolean b12 = queue6.add((java.lang.Object) queue11);
        Queue queue13 = new Queue();
        boolean b14 = queue6.add((java.lang.Object) queue13);
        boolean b15 = queue0.add((java.lang.Object) b14);
        java.lang.Object obj16 = queue0.element();
        boolean b18 = queue0.add((java.lang.Object) 10L);
        Queue queue19 = new Queue();
        boolean b21 = queue19.add((java.lang.Object) "");
        java.lang.Object obj22 = queue19.element();
        java.lang.Object obj23 = queue19.element();
        java.lang.Object obj24 = queue19.remove();
        boolean b25 = queue0.add((java.lang.Object) queue19);
        try {
            java.lang.Object obj26 = queue19.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + true + "'", obj16.equals(true));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj9 = queue6.remove();
        boolean b10 = queue0.add((java.lang.Object) queue6);
        java.lang.Object obj11 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "" + "'", obj11.equals(""));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        Queue queue4 = new Queue();
        boolean b6 = queue4.add((java.lang.Object) 1.0f);
        Queue queue7 = new Queue();
        boolean b9 = queue7.add((java.lang.Object) "");
        java.lang.Object obj10 = queue7.remove();
        boolean b11 = queue4.add((java.lang.Object) queue7);
        boolean b12 = queue0.add((java.lang.Object) queue7);
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) "");
        java.lang.Object obj16 = queue13.element();
        java.lang.Object obj17 = queue13.element();
        Queue queue18 = new Queue();
        boolean b19 = queue13.add((java.lang.Object) queue18);
        Queue queue20 = new Queue();
        boolean b21 = queue13.add((java.lang.Object) queue20);
        java.lang.Object obj22 = queue13.remove();
        boolean b23 = queue7.add(obj22);
        java.lang.Object obj24 = queue7.remove();
        try {
            java.lang.Object obj25 = queue7.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj9 = queue6.remove();
        boolean b11 = queue6.add((java.lang.Object) 1.0d);
        boolean b12 = queue0.add((java.lang.Object) queue6);
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) "");
        boolean b17 = queue13.add((java.lang.Object) (-1.0d));
        Queue queue18 = new Queue();
        boolean b20 = queue18.add((java.lang.Object) 1.0f);
        java.lang.Object obj21 = queue18.element();
        boolean b22 = queue13.add((java.lang.Object) queue18);
        java.lang.Object obj23 = queue18.element();
        boolean b25 = queue18.add((java.lang.Object) "hi!");
        boolean b26 = queue6.add((java.lang.Object) b25);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1.0f + "'", obj21.equals(1.0f));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1.0f + "'", obj23.equals(1.0f));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.remove();
        Queue queue4 = new Queue();
        boolean b6 = queue4.add((java.lang.Object) 1.0f);
        java.lang.Object obj7 = queue4.element();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) 1.0f);
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) "");
        java.lang.Object obj14 = queue11.remove();
        boolean b15 = queue8.add((java.lang.Object) queue11);
        boolean b16 = queue4.add((java.lang.Object) queue11);
        boolean b17 = queue0.add((java.lang.Object) b16);
        Queue queue18 = new Queue();
        boolean b20 = queue18.add((java.lang.Object) 1.0f);
        java.lang.Object obj21 = queue18.remove();
        boolean b23 = queue18.add((java.lang.Object) 1.0d);
        boolean b24 = queue0.add((java.lang.Object) b23);
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) 1.0f);
        java.lang.Object obj28 = queue25.element();
        java.lang.Object obj29 = queue25.element();
        boolean b30 = queue0.add(obj29);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1.0f + "'", obj21.equals(1.0f));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1.0f + "'", obj28.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1.0f + "'", obj29.equals(1.0f));
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        java.lang.Object obj5 = queue0.remove();
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        java.lang.Object obj9 = queue6.element();
        java.lang.Object obj10 = queue6.element();
        Queue queue11 = new Queue();
        boolean b12 = queue6.add((java.lang.Object) queue11);
        java.lang.Object obj13 = queue6.element();
        Queue queue14 = new Queue();
        boolean b16 = queue14.add((java.lang.Object) 1.0f);
        boolean b17 = queue6.add((java.lang.Object) b16);
        boolean b18 = queue0.add((java.lang.Object) b17);
        java.lang.Object obj19 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "" + "'", obj5.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + true + "'", obj19.equals(true));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.remove();
        try {
            java.lang.Object obj5 = queue0.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) (-1.0f));
        boolean b7 = queue0.add((java.lang.Object) 10);
        java.lang.Object obj8 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        Queue queue5 = new Queue();
        boolean b6 = queue0.add((java.lang.Object) queue5);
        java.lang.Object obj7 = queue0.element();
        java.lang.Object obj8 = queue0.remove();
        java.lang.Object obj9 = queue0.element();
        java.lang.Object obj10 = queue0.remove();
        try {
            java.lang.Object obj11 = queue0.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "" + "'", obj8.equals(""));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        Queue queue5 = new Queue();
        boolean b6 = queue0.add((java.lang.Object) queue5);
        Queue queue7 = new Queue();
        boolean b8 = queue0.add((java.lang.Object) queue7);
        java.lang.Object obj9 = queue0.remove();
        java.lang.Object obj10 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) 1.0f);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        java.lang.Object obj9 = queue6.remove();
        boolean b10 = queue3.add((java.lang.Object) queue6);
        boolean b12 = queue6.add((java.lang.Object) 10L);
        boolean b13 = queue0.add((java.lang.Object) queue6);
        java.lang.Object obj14 = queue6.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 10L + "'", obj14.equals(10L));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) "");
        java.lang.Object obj6 = queue3.remove();
        boolean b7 = queue0.add((java.lang.Object) queue3);
        java.lang.Object obj8 = queue0.element();
        java.lang.Object obj9 = queue0.element();
        java.lang.Object obj10 = queue0.remove();
        java.lang.Object obj11 = queue0.remove();
        try {
            java.lang.Object obj12 = queue0.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1.0f + "'", obj10.equals(1.0f));
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) "");
        java.lang.Object obj6 = queue3.remove();
        boolean b7 = queue0.add((java.lang.Object) queue3);
        java.lang.Object obj8 = queue0.remove();
        Queue queue9 = new Queue();
        boolean b11 = queue9.add((java.lang.Object) 1.0f);
        java.lang.Object obj12 = queue9.remove();
        boolean b14 = queue9.add((java.lang.Object) 1.0d);
        Queue queue15 = new Queue();
        boolean b17 = queue15.add((java.lang.Object) "");
        boolean b19 = queue15.add((java.lang.Object) (-1.0d));
        boolean b21 = queue15.add((java.lang.Object) (short) -1);
        boolean b22 = queue9.add((java.lang.Object) queue15);
        boolean b23 = queue0.add((java.lang.Object) b22);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) "");
        java.lang.Object obj6 = queue3.remove();
        boolean b7 = queue0.add((java.lang.Object) queue3);
        java.lang.Object obj8 = queue0.element();
        java.lang.Object obj9 = queue0.element();
        Queue queue10 = new Queue();
        boolean b12 = queue10.add((java.lang.Object) "");
        java.lang.Object obj13 = queue10.element();
        java.lang.Object obj14 = queue10.element();
        boolean b16 = queue10.add((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = queue10.element();
        boolean b18 = queue0.add((java.lang.Object) queue10);
        java.lang.Object obj19 = queue10.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "" + "'", obj19.equals(""));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        java.lang.Object obj5 = queue0.remove();
        boolean b7 = queue0.add((java.lang.Object) (byte) 10);
        java.lang.Object obj8 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) 10 + "'", obj8.equals((byte) 10));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj9 = queue6.remove();
        boolean b11 = queue6.add((java.lang.Object) 1.0d);
        boolean b12 = queue0.add((java.lang.Object) queue6);
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) "");
        java.lang.Object obj16 = queue13.element();
        java.lang.Object obj17 = queue13.remove();
        boolean b18 = queue6.add((java.lang.Object) queue13);
        Queue queue19 = new Queue();
        boolean b21 = queue19.add((java.lang.Object) 1.0f);
        java.lang.Object obj22 = queue19.element();
        java.lang.Object obj23 = queue19.element();
        java.lang.Object obj24 = queue19.remove();
        boolean b26 = queue19.add((java.lang.Object) (byte) 10);
        boolean b27 = queue6.add((java.lang.Object) (byte) 10);
        java.lang.Object obj28 = queue6.element();
        java.lang.Object obj29 = queue6.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1.0f + "'", obj22.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1.0f + "'", obj23.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 1.0f + "'", obj24.equals(1.0f));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1.0d + "'", obj28.equals(1.0d));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1.0d + "'", obj29.equals(1.0d));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        boolean b6 = queue0.add((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = queue0.remove();
        java.lang.Object obj8 = queue0.remove();
        try {
            java.lang.Object obj9 = queue0.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) 0 + "'", obj8.equals((byte) 0));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) 1.0d);
        java.lang.Object obj5 = queue0.element();
        java.lang.Object obj6 = queue0.element();
        Queue queue7 = new Queue();
        boolean b9 = queue7.add((java.lang.Object) 1.0f);
        Queue queue10 = new Queue();
        boolean b12 = queue10.add((java.lang.Object) "");
        java.lang.Object obj13 = queue10.remove();
        boolean b14 = queue7.add((java.lang.Object) queue10);
        java.lang.Object obj15 = queue7.element();
        java.lang.Object obj16 = queue7.element();
        Queue queue17 = new Queue();
        boolean b19 = queue17.add((java.lang.Object) "");
        java.lang.Object obj20 = queue17.element();
        java.lang.Object obj21 = queue17.element();
        boolean b23 = queue17.add((java.lang.Object) (byte) 0);
        java.lang.Object obj24 = queue17.element();
        boolean b25 = queue7.add((java.lang.Object) queue17);
        boolean b26 = queue0.add((java.lang.Object) queue7);
        java.lang.Object obj27 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "" + "'", obj5.equals(""));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1.0f + "'", obj15.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1.0f + "'", obj16.equals(1.0f));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "" + "'", obj20.equals(""));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "" + "'", obj21.equals(""));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "" + "'", obj27.equals(""));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        boolean b6 = queue0.add((java.lang.Object) (short) -1);
        java.lang.Object obj7 = queue0.element();
        java.lang.Object obj8 = queue0.remove();
        java.lang.Object obj9 = queue0.remove();
        Queue queue10 = new Queue();
        boolean b12 = queue10.add((java.lang.Object) 1.0f);
        java.lang.Object obj13 = queue10.element();
        java.lang.Object obj14 = queue10.element();
        java.lang.Object obj15 = queue10.remove();
        Queue queue16 = new Queue();
        boolean b18 = queue16.add((java.lang.Object) "");
        java.lang.Object obj19 = queue16.element();
        java.lang.Object obj20 = queue16.element();
        Queue queue21 = new Queue();
        boolean b22 = queue16.add((java.lang.Object) queue21);
        Queue queue23 = new Queue();
        boolean b24 = queue16.add((java.lang.Object) queue23);
        boolean b25 = queue10.add((java.lang.Object) b24);
        java.lang.Object obj26 = queue10.element();
        java.lang.Object obj27 = queue10.element();
        java.lang.Object obj28 = queue10.remove();
        boolean b29 = queue0.add(obj28);
        java.lang.Object obj30 = queue0.remove();
        java.lang.Object obj31 = queue0.element();
        Queue queue32 = new Queue();
        boolean b34 = queue32.add((java.lang.Object) 1.0f);
        Queue queue35 = new Queue();
        boolean b37 = queue35.add((java.lang.Object) "");
        java.lang.Object obj38 = queue35.remove();
        boolean b39 = queue32.add((java.lang.Object) queue35);
        java.lang.Object obj40 = queue32.element();
        java.lang.Object obj41 = queue32.element();
        Queue queue42 = new Queue();
        boolean b44 = queue42.add((java.lang.Object) "");
        java.lang.Object obj45 = queue42.element();
        java.lang.Object obj46 = queue42.element();
        boolean b48 = queue42.add((java.lang.Object) (byte) 0);
        java.lang.Object obj49 = queue42.element();
        boolean b50 = queue32.add((java.lang.Object) queue42);
        java.lang.Object obj51 = queue32.remove();
        Queue queue52 = new Queue();
        boolean b54 = queue52.add((java.lang.Object) 1.0f);
        Queue queue55 = new Queue();
        boolean b57 = queue55.add((java.lang.Object) "");
        java.lang.Object obj58 = queue55.remove();
        boolean b59 = queue52.add((java.lang.Object) queue55);
        java.lang.Object obj60 = queue52.element();
        java.lang.Object obj61 = queue52.element();
        Queue queue62 = new Queue();
        boolean b64 = queue62.add((java.lang.Object) "");
        java.lang.Object obj65 = queue62.element();
        java.lang.Object obj66 = queue62.element();
        boolean b68 = queue62.add((java.lang.Object) (byte) 0);
        java.lang.Object obj69 = queue62.element();
        boolean b70 = queue52.add((java.lang.Object) queue62);
        java.lang.Object obj71 = queue52.remove();
        boolean b72 = queue32.add(obj71);
        Queue queue73 = new Queue();
        boolean b75 = queue73.add((java.lang.Object) 1.0f);
        Queue queue76 = new Queue();
        boolean b78 = queue76.add((java.lang.Object) "");
        java.lang.Object obj79 = queue76.remove();
        boolean b80 = queue73.add((java.lang.Object) queue76);
        java.lang.Object obj81 = queue73.element();
        java.lang.Object obj82 = queue73.element();
        Queue queue83 = new Queue();
        boolean b85 = queue83.add((java.lang.Object) "");
        java.lang.Object obj86 = queue83.element();
        java.lang.Object obj87 = queue83.element();
        boolean b89 = queue83.add((java.lang.Object) (byte) 0);
        java.lang.Object obj90 = queue83.element();
        boolean b91 = queue73.add((java.lang.Object) queue83);
        boolean b92 = queue32.add((java.lang.Object) queue73);
        java.lang.Object obj93 = queue32.element();
        boolean b94 = queue0.add(obj93);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "" + "'", obj8.equals(""));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1.0d) + "'", obj9.equals((-1.0d)));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0f + "'", obj13.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1.0f + "'", obj14.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1.0f + "'", obj15.equals(1.0f));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "" + "'", obj19.equals(""));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "" + "'", obj20.equals(""));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + true + "'", obj26.equals(true));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + true + "'", obj27.equals(true));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) -1 + "'", obj30.equals((short) -1));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + true + "'", obj31.equals(true));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "" + "'", obj38.equals(""));
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1.0f + "'", obj40.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1.0f + "'", obj41.equals(1.0f));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "" + "'", obj45.equals(""));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + "" + "'", obj46.equals(""));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + "" + "'", obj49.equals(""));
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 1.0f + "'", obj51.equals(1.0f));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + "" + "'", obj58.equals(""));
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 1.0f + "'", obj60.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 1.0f + "'", obj61.equals(1.0f));
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + "" + "'", obj65.equals(""));
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + "" + "'", obj66.equals(""));
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + "" + "'", obj69.equals(""));
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 1.0f + "'", obj71.equals(1.0f));
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + "" + "'", obj79.equals(""));
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + 1.0f + "'", obj81.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 1.0f + "'", obj82.equals(1.0f));
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + "" + "'", obj86.equals(""));
        org.junit.Assert.assertTrue("'" + obj87 + "' != '" + "" + "'", obj87.equals(""));
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + "" + "'", obj90.equals(""));
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertNotNull(obj93);
        org.junit.Assert.assertTrue(b94 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) "");
        java.lang.Object obj6 = queue3.remove();
        boolean b7 = queue0.add((java.lang.Object) queue3);
        java.lang.Object obj8 = queue0.element();
        java.lang.Object obj9 = queue0.element();
        Queue queue10 = new Queue();
        boolean b12 = queue10.add((java.lang.Object) "");
        java.lang.Object obj13 = queue10.element();
        java.lang.Object obj14 = queue10.element();
        boolean b16 = queue10.add((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = queue10.element();
        boolean b18 = queue0.add((java.lang.Object) queue10);
        java.lang.Object obj19 = queue0.remove();
        Queue queue20 = new Queue();
        boolean b22 = queue20.add((java.lang.Object) 1.0f);
        Queue queue23 = new Queue();
        boolean b25 = queue23.add((java.lang.Object) "");
        java.lang.Object obj26 = queue23.remove();
        boolean b27 = queue20.add((java.lang.Object) queue23);
        java.lang.Object obj28 = queue20.element();
        java.lang.Object obj29 = queue20.element();
        Queue queue30 = new Queue();
        boolean b32 = queue30.add((java.lang.Object) "");
        java.lang.Object obj33 = queue30.element();
        java.lang.Object obj34 = queue30.element();
        boolean b36 = queue30.add((java.lang.Object) (byte) 0);
        java.lang.Object obj37 = queue30.element();
        boolean b38 = queue20.add((java.lang.Object) queue30);
        java.lang.Object obj39 = queue20.remove();
        boolean b40 = queue0.add(obj39);
        Queue queue41 = new Queue();
        boolean b43 = queue41.add((java.lang.Object) 1.0f);
        Queue queue44 = new Queue();
        boolean b46 = queue44.add((java.lang.Object) "");
        java.lang.Object obj47 = queue44.remove();
        boolean b48 = queue41.add((java.lang.Object) queue44);
        java.lang.Object obj49 = queue41.element();
        java.lang.Object obj50 = queue41.element();
        Queue queue51 = new Queue();
        boolean b53 = queue51.add((java.lang.Object) "");
        java.lang.Object obj54 = queue51.element();
        java.lang.Object obj55 = queue51.element();
        boolean b57 = queue51.add((java.lang.Object) (byte) 0);
        java.lang.Object obj58 = queue51.element();
        boolean b59 = queue41.add((java.lang.Object) queue51);
        boolean b60 = queue0.add((java.lang.Object) queue41);
        java.lang.Object obj61 = queue0.remove();
        java.lang.Object obj62 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0f + "'", obj19.equals(1.0f));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1.0f + "'", obj28.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1.0f + "'", obj29.equals(1.0f));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "" + "'", obj33.equals(""));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "" + "'", obj34.equals(""));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1.0f + "'", obj39.equals(1.0f));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + "" + "'", obj47.equals(""));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 1.0f + "'", obj49.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 1.0f + "'", obj50.equals(1.0f));
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + "" + "'", obj54.equals(""));
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + "" + "'", obj55.equals(""));
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + "" + "'", obj58.equals(""));
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertNotNull(obj62);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        java.lang.Object obj5 = queue0.remove();
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        java.lang.Object obj9 = queue6.element();
        java.lang.Object obj10 = queue6.element();
        Queue queue11 = new Queue();
        boolean b12 = queue6.add((java.lang.Object) queue11);
        Queue queue13 = new Queue();
        boolean b14 = queue6.add((java.lang.Object) queue13);
        boolean b15 = queue0.add((java.lang.Object) b14);
        java.lang.Object obj16 = queue0.element();
        java.lang.Object obj17 = queue0.element();
        java.lang.Object obj18 = queue0.remove();
        Queue queue19 = new Queue();
        boolean b21 = queue19.add((java.lang.Object) 1.0f);
        java.lang.Object obj22 = queue19.element();
        java.lang.Object obj23 = queue19.element();
        java.lang.Object obj24 = queue19.remove();
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) "");
        java.lang.Object obj28 = queue25.element();
        java.lang.Object obj29 = queue25.element();
        Queue queue30 = new Queue();
        boolean b31 = queue25.add((java.lang.Object) queue30);
        Queue queue32 = new Queue();
        boolean b33 = queue25.add((java.lang.Object) queue32);
        boolean b34 = queue19.add((java.lang.Object) b33);
        java.lang.Object obj35 = queue19.element();
        boolean b37 = queue19.add((java.lang.Object) 10L);
        Queue queue38 = new Queue();
        boolean b40 = queue38.add((java.lang.Object) "");
        java.lang.Object obj41 = queue38.element();
        java.lang.Object obj42 = queue38.element();
        java.lang.Object obj43 = queue38.remove();
        boolean b44 = queue19.add((java.lang.Object) queue38);
        boolean b45 = queue0.add((java.lang.Object) b44);
        java.lang.Object obj46 = queue0.remove();
        boolean b48 = queue0.add((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + true + "'", obj16.equals(true));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + true + "'", obj17.equals(true));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + true + "'", obj18.equals(true));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1.0f + "'", obj22.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1.0f + "'", obj23.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 1.0f + "'", obj24.equals(1.0f));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "" + "'", obj28.equals(""));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + true + "'", obj35.equals(true));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + "" + "'", obj41.equals(""));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "" + "'", obj43.equals(""));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + true + "'", obj46.equals(true));
        org.junit.Assert.assertTrue(b48 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        java.lang.Object obj5 = queue0.remove();
        try {
            java.lang.Object obj6 = queue0.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "" + "'", obj5.equals(""));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj9 = queue6.remove();
        boolean b11 = queue6.add((java.lang.Object) 1.0d);
        boolean b12 = queue0.add((java.lang.Object) queue6);
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) "");
        java.lang.Object obj16 = queue13.element();
        java.lang.Object obj17 = queue13.remove();
        boolean b18 = queue6.add((java.lang.Object) queue13);
        Queue queue19 = new Queue();
        boolean b21 = queue19.add((java.lang.Object) "");
        java.lang.Object obj22 = queue19.element();
        boolean b24 = queue19.add((java.lang.Object) 1);
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) "");
        boolean b29 = queue25.add((java.lang.Object) (-1.0d));
        boolean b31 = queue25.add((java.lang.Object) (short) -1);
        java.lang.Object obj32 = queue25.remove();
        boolean b34 = queue25.add((java.lang.Object) 1);
        boolean b35 = queue19.add((java.lang.Object) b34);
        boolean b36 = queue6.add((java.lang.Object) queue19);
        Queue queue37 = new Queue();
        boolean b39 = queue37.add((java.lang.Object) 1.0f);
        Queue queue40 = new Queue();
        boolean b42 = queue40.add((java.lang.Object) "");
        java.lang.Object obj43 = queue40.remove();
        boolean b44 = queue37.add((java.lang.Object) queue40);
        java.lang.Object obj45 = queue37.element();
        java.lang.Object obj46 = queue37.element();
        java.lang.Object obj47 = queue37.remove();
        java.lang.Object obj48 = queue37.element();
        boolean b49 = queue6.add((java.lang.Object) queue37);
        Queue queue50 = new Queue();
        boolean b52 = queue50.add((java.lang.Object) "");
        boolean b54 = queue50.add((java.lang.Object) 1.0d);
        boolean b56 = queue50.add((java.lang.Object) (byte) 100);
        java.lang.Object obj57 = queue50.remove();
        java.lang.Object obj58 = queue50.element();
        java.lang.Object obj59 = queue50.remove();
        boolean b60 = queue6.add(obj59);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "" + "'", obj32.equals(""));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "" + "'", obj43.equals(""));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 1.0f + "'", obj45.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 1.0f + "'", obj46.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 1.0f + "'", obj47.equals(1.0f));
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + "" + "'", obj57.equals(""));
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 1.0d + "'", obj58.equals(1.0d));
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 1.0d + "'", obj59.equals(1.0d));
        org.junit.Assert.assertTrue(b60 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) "");
        java.lang.Object obj6 = queue3.remove();
        boolean b7 = queue0.add((java.lang.Object) queue3);
        java.lang.Object obj8 = queue0.element();
        java.lang.Object obj9 = queue0.element();
        Queue queue10 = new Queue();
        boolean b12 = queue10.add((java.lang.Object) "");
        java.lang.Object obj13 = queue10.element();
        java.lang.Object obj14 = queue10.element();
        boolean b16 = queue10.add((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = queue10.element();
        boolean b18 = queue0.add((java.lang.Object) queue10);
        java.lang.Object obj19 = queue0.remove();
        Queue queue20 = new Queue();
        boolean b22 = queue20.add((java.lang.Object) 1.0f);
        Queue queue23 = new Queue();
        boolean b25 = queue23.add((java.lang.Object) "");
        java.lang.Object obj26 = queue23.remove();
        boolean b27 = queue20.add((java.lang.Object) queue23);
        java.lang.Object obj28 = queue20.element();
        java.lang.Object obj29 = queue20.element();
        Queue queue30 = new Queue();
        boolean b32 = queue30.add((java.lang.Object) "");
        java.lang.Object obj33 = queue30.element();
        java.lang.Object obj34 = queue30.element();
        boolean b36 = queue30.add((java.lang.Object) (byte) 0);
        java.lang.Object obj37 = queue30.element();
        boolean b38 = queue20.add((java.lang.Object) queue30);
        java.lang.Object obj39 = queue20.remove();
        boolean b40 = queue0.add(obj39);
        Queue queue41 = new Queue();
        boolean b43 = queue41.add((java.lang.Object) 1.0f);
        Queue queue44 = new Queue();
        boolean b46 = queue44.add((java.lang.Object) "");
        java.lang.Object obj47 = queue44.remove();
        boolean b48 = queue41.add((java.lang.Object) queue44);
        java.lang.Object obj49 = queue41.element();
        java.lang.Object obj50 = queue41.element();
        Queue queue51 = new Queue();
        boolean b53 = queue51.add((java.lang.Object) "");
        java.lang.Object obj54 = queue51.element();
        java.lang.Object obj55 = queue51.element();
        boolean b57 = queue51.add((java.lang.Object) (byte) 0);
        java.lang.Object obj58 = queue51.element();
        boolean b59 = queue41.add((java.lang.Object) queue51);
        boolean b60 = queue0.add((java.lang.Object) queue41);
        Queue queue61 = new Queue();
        boolean b63 = queue61.add((java.lang.Object) "");
        boolean b64 = queue41.add((java.lang.Object) b63);
        Queue queue65 = new Queue();
        boolean b67 = queue65.add((java.lang.Object) "");
        java.lang.Object obj68 = queue65.element();
        java.lang.Object obj69 = queue65.element();
        Queue queue70 = new Queue();
        boolean b71 = queue65.add((java.lang.Object) queue70);
        Queue queue72 = new Queue();
        boolean b73 = queue65.add((java.lang.Object) queue72);
        Queue queue74 = new Queue();
        boolean b76 = queue74.add((java.lang.Object) "");
        boolean b78 = queue74.add((java.lang.Object) (-1.0d));
        boolean b80 = queue74.add((java.lang.Object) (short) -1);
        boolean b82 = queue74.add((java.lang.Object) (short) 0);
        boolean b83 = queue72.add((java.lang.Object) b82);
        boolean b84 = queue41.add((java.lang.Object) b82);
        java.lang.Object obj85 = queue41.remove();
        java.lang.Object obj86 = queue41.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0f + "'", obj19.equals(1.0f));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1.0f + "'", obj28.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1.0f + "'", obj29.equals(1.0f));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "" + "'", obj33.equals(""));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "" + "'", obj34.equals(""));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1.0f + "'", obj39.equals(1.0f));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + "" + "'", obj47.equals(""));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 1.0f + "'", obj49.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 1.0f + "'", obj50.equals(1.0f));
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + "" + "'", obj54.equals(""));
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + "" + "'", obj55.equals(""));
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + "" + "'", obj58.equals(""));
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + "" + "'", obj68.equals(""));
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + "" + "'", obj69.equals(""));
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue(b80 == true);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue(b83 == true);
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + 1.0f + "'", obj85.equals(1.0f));
        org.junit.Assert.assertNotNull(obj86);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        Queue queue5 = new Queue();
        boolean b7 = queue5.add((java.lang.Object) "");
        boolean b9 = queue5.add((java.lang.Object) 1.0d);
        boolean b11 = queue5.add((java.lang.Object) (byte) 100);
        boolean b12 = queue0.add((java.lang.Object) queue5);
        java.lang.Object obj13 = queue5.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        java.lang.Object obj6 = queue0.element();
        Queue queue7 = new Queue();
        boolean b9 = queue7.add((java.lang.Object) "");
        java.lang.Object obj10 = queue7.element();
        java.lang.Object obj11 = queue7.element();
        boolean b13 = queue7.add((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = queue7.remove();
        boolean b15 = queue0.add(obj14);
        java.lang.Object obj16 = queue0.remove();
        boolean b18 = queue0.add((java.lang.Object) 0);
        java.lang.Object obj19 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "" + "'", obj11.equals(""));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1 + "'", obj19.equals(1));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        Queue queue5 = new Queue();
        boolean b6 = queue0.add((java.lang.Object) queue5);
        Queue queue7 = new Queue();
        boolean b8 = queue0.add((java.lang.Object) queue7);
        java.lang.Object obj9 = queue0.remove();
        boolean b11 = queue0.add((java.lang.Object) (-1));
        java.lang.Object obj12 = null;
        boolean b13 = queue0.add(obj12);
        java.lang.Object obj14 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        Queue queue5 = new Queue();
        boolean b7 = queue5.add((java.lang.Object) 1.0f);
        java.lang.Object obj8 = queue5.remove();
        boolean b10 = queue5.add((java.lang.Object) 1.0d);
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) "");
        boolean b15 = queue11.add((java.lang.Object) (-1.0d));
        boolean b17 = queue11.add((java.lang.Object) (short) -1);
        boolean b18 = queue5.add((java.lang.Object) queue11);
        boolean b19 = queue0.add((java.lang.Object) b18);
        Queue queue20 = new Queue();
        boolean b22 = queue20.add((java.lang.Object) "");
        java.lang.Object obj23 = queue20.element();
        boolean b25 = queue20.add((java.lang.Object) 1);
        java.lang.Object obj26 = queue20.element();
        Queue queue27 = new Queue();
        boolean b29 = queue27.add((java.lang.Object) "");
        java.lang.Object obj30 = queue27.element();
        java.lang.Object obj31 = queue27.element();
        boolean b33 = queue27.add((java.lang.Object) (byte) 0);
        boolean b34 = queue20.add((java.lang.Object) (byte) 0);
        Queue queue35 = new Queue();
        boolean b37 = queue35.add((java.lang.Object) "");
        java.lang.Object obj38 = queue35.element();
        java.lang.Object obj39 = queue35.element();
        Queue queue40 = new Queue();
        boolean b41 = queue35.add((java.lang.Object) queue40);
        Queue queue42 = new Queue();
        boolean b43 = queue35.add((java.lang.Object) queue42);
        java.lang.Object obj44 = queue35.remove();
        boolean b45 = queue20.add(obj44);
        boolean b46 = queue0.add((java.lang.Object) queue20);
        java.lang.Object obj47 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "" + "'", obj30.equals(""));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "" + "'", obj31.equals(""));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "" + "'", obj38.equals(""));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "" + "'", obj39.equals(""));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "" + "'", obj44.equals(""));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + "" + "'", obj47.equals(""));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        Queue queue5 = new Queue();
        boolean b6 = queue0.add((java.lang.Object) queue5);
        Queue queue7 = new Queue();
        boolean b8 = queue0.add((java.lang.Object) queue7);
        java.lang.Object obj9 = queue0.element();
        java.lang.Object obj10 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj9 = queue6.remove();
        boolean b11 = queue6.add((java.lang.Object) 1.0d);
        boolean b12 = queue0.add((java.lang.Object) queue6);
        boolean b14 = queue6.add((java.lang.Object) 10.0d);
        java.lang.Object obj15 = queue6.remove();
        java.lang.Object obj16 = queue6.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1.0d + "'", obj15.equals(1.0d));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 10.0d + "'", obj16.equals(10.0d));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        boolean b6 = queue0.add((java.lang.Object) (short) -1);
        java.lang.Object obj7 = queue0.element();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) "");
        boolean b12 = queue8.add((java.lang.Object) (-1.0d));
        boolean b14 = queue8.add((java.lang.Object) (short) -1);
        java.lang.Object obj15 = queue8.element();
        boolean b16 = queue0.add((java.lang.Object) queue8);
        java.lang.Object obj17 = queue0.element();
        Queue queue18 = new Queue();
        boolean b19 = queue0.add((java.lang.Object) queue18);
        java.lang.Object obj20 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "" + "'", obj20.equals(""));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        Queue queue5 = new Queue();
        boolean b7 = queue5.add((java.lang.Object) 1.0f);
        java.lang.Object obj8 = queue5.element();
        boolean b9 = queue0.add((java.lang.Object) queue5);
        Queue queue10 = new Queue();
        boolean b12 = queue10.add((java.lang.Object) 1.0f);
        java.lang.Object obj13 = queue10.element();
        java.lang.Object obj14 = queue10.element();
        java.lang.Object obj15 = queue10.remove();
        Queue queue16 = new Queue();
        boolean b18 = queue16.add((java.lang.Object) "");
        java.lang.Object obj19 = queue16.element();
        java.lang.Object obj20 = queue16.element();
        Queue queue21 = new Queue();
        boolean b22 = queue16.add((java.lang.Object) queue21);
        Queue queue23 = new Queue();
        boolean b24 = queue16.add((java.lang.Object) queue23);
        boolean b25 = queue10.add((java.lang.Object) b24);
        java.lang.Object obj26 = queue10.element();
        java.lang.Object obj27 = queue10.element();
        java.lang.Object obj28 = queue10.remove();
        Queue queue29 = new Queue();
        boolean b31 = queue29.add((java.lang.Object) 1.0f);
        Queue queue32 = new Queue();
        boolean b34 = queue32.add((java.lang.Object) "");
        java.lang.Object obj35 = queue32.remove();
        boolean b36 = queue29.add((java.lang.Object) queue32);
        boolean b38 = queue32.add((java.lang.Object) 10L);
        boolean b39 = queue10.add((java.lang.Object) b38);
        boolean b40 = queue0.add((java.lang.Object) b39);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0f + "'", obj13.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1.0f + "'", obj14.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1.0f + "'", obj15.equals(1.0f));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "" + "'", obj19.equals(""));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "" + "'", obj20.equals(""));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + true + "'", obj26.equals(true));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + true + "'", obj27.equals(true));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + "" + "'", obj35.equals(""));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.remove();
        boolean b5 = queue0.add((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = queue0.remove();
        try {
            java.lang.Object obj7 = queue0.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte) 0 + "'", obj6.equals((byte) 0));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) "");
        java.lang.Object obj6 = queue3.remove();
        boolean b7 = queue0.add((java.lang.Object) queue3);
        java.lang.Object obj8 = queue0.element();
        java.lang.Object obj9 = queue0.element();
        Queue queue10 = new Queue();
        boolean b12 = queue10.add((java.lang.Object) "");
        java.lang.Object obj13 = queue10.element();
        java.lang.Object obj14 = queue10.element();
        boolean b16 = queue10.add((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = queue10.element();
        boolean b18 = queue0.add((java.lang.Object) queue10);
        java.lang.Object obj19 = queue0.remove();
        Queue queue20 = new Queue();
        boolean b22 = queue20.add((java.lang.Object) 1.0f);
        Queue queue23 = new Queue();
        boolean b25 = queue23.add((java.lang.Object) "");
        java.lang.Object obj26 = queue23.remove();
        boolean b27 = queue20.add((java.lang.Object) queue23);
        java.lang.Object obj28 = queue20.element();
        java.lang.Object obj29 = queue20.element();
        Queue queue30 = new Queue();
        boolean b32 = queue30.add((java.lang.Object) "");
        java.lang.Object obj33 = queue30.element();
        java.lang.Object obj34 = queue30.element();
        boolean b36 = queue30.add((java.lang.Object) (byte) 0);
        java.lang.Object obj37 = queue30.element();
        boolean b38 = queue20.add((java.lang.Object) queue30);
        java.lang.Object obj39 = queue20.remove();
        boolean b40 = queue0.add(obj39);
        Queue queue41 = new Queue();
        boolean b43 = queue41.add((java.lang.Object) 1.0f);
        Queue queue44 = new Queue();
        boolean b46 = queue44.add((java.lang.Object) "");
        java.lang.Object obj47 = queue44.remove();
        boolean b48 = queue41.add((java.lang.Object) queue44);
        java.lang.Object obj49 = queue41.element();
        java.lang.Object obj50 = queue41.element();
        Queue queue51 = new Queue();
        boolean b53 = queue51.add((java.lang.Object) "");
        java.lang.Object obj54 = queue51.element();
        java.lang.Object obj55 = queue51.element();
        boolean b57 = queue51.add((java.lang.Object) (byte) 0);
        java.lang.Object obj58 = queue51.element();
        boolean b59 = queue41.add((java.lang.Object) queue51);
        boolean b60 = queue0.add((java.lang.Object) queue41);
        Queue queue61 = new Queue();
        boolean b63 = queue61.add((java.lang.Object) "");
        boolean b64 = queue41.add((java.lang.Object) b63);
        java.lang.Object obj65 = queue41.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0f + "'", obj19.equals(1.0f));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1.0f + "'", obj28.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1.0f + "'", obj29.equals(1.0f));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "" + "'", obj33.equals(""));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "" + "'", obj34.equals(""));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1.0f + "'", obj39.equals(1.0f));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + "" + "'", obj47.equals(""));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 1.0f + "'", obj49.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 1.0f + "'", obj50.equals(1.0f));
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + "" + "'", obj54.equals(""));
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + "" + "'", obj55.equals(""));
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + "" + "'", obj58.equals(""));
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 1.0f + "'", obj65.equals(1.0f));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj9 = queue6.remove();
        boolean b11 = queue6.add((java.lang.Object) 1.0d);
        boolean b12 = queue0.add((java.lang.Object) queue6);
        java.lang.Object obj13 = queue6.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0d + "'", obj13.equals(1.0d));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.remove();
        boolean b5 = queue0.add((java.lang.Object) 1.0d);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        boolean b10 = queue6.add((java.lang.Object) (-1.0d));
        boolean b12 = queue6.add((java.lang.Object) (short) -1);
        boolean b13 = queue0.add((java.lang.Object) queue6);
        java.lang.Object obj14 = queue6.remove();
        java.lang.Object obj15 = queue6.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (-1.0d) + "'", obj15.equals((-1.0d)));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        boolean b6 = queue0.add((java.lang.Object) 100.0f);
        java.lang.Object obj7 = queue0.remove();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) 1.0f);
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) "");
        java.lang.Object obj14 = queue11.remove();
        boolean b15 = queue8.add((java.lang.Object) queue11);
        boolean b16 = queue0.add((java.lang.Object) queue8);
        java.lang.Object obj17 = queue8.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1.0f + "'", obj17.equals(1.0f));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.remove();
        boolean b5 = queue0.add((java.lang.Object) 1.0d);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        boolean b10 = queue6.add((java.lang.Object) (-1.0d));
        boolean b12 = queue6.add((java.lang.Object) (short) -1);
        boolean b13 = queue0.add((java.lang.Object) queue6);
        java.lang.Object obj14 = queue6.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = queue0.element();
        java.lang.Object obj6 = queue0.element();
        Queue queue7 = new Queue();
        boolean b9 = queue7.add((java.lang.Object) 1.0f);
        Queue queue10 = new Queue();
        boolean b12 = queue10.add((java.lang.Object) "");
        java.lang.Object obj13 = queue10.remove();
        boolean b14 = queue7.add((java.lang.Object) queue10);
        java.lang.Object obj15 = queue7.element();
        java.lang.Object obj16 = queue7.element();
        Queue queue17 = new Queue();
        boolean b19 = queue17.add((java.lang.Object) "");
        java.lang.Object obj20 = queue17.element();
        java.lang.Object obj21 = queue17.element();
        boolean b23 = queue17.add((java.lang.Object) (byte) 0);
        java.lang.Object obj24 = queue17.element();
        boolean b25 = queue7.add((java.lang.Object) queue17);
        java.lang.Object obj26 = queue7.remove();
        boolean b27 = queue0.add(obj26);
        Queue queue28 = new Queue();
        boolean b30 = queue28.add((java.lang.Object) "");
        java.lang.Object obj31 = queue28.element();
        boolean b33 = queue28.add((java.lang.Object) 1);
        java.lang.Object obj34 = queue28.element();
        Queue queue35 = new Queue();
        boolean b37 = queue35.add((java.lang.Object) "");
        java.lang.Object obj38 = queue35.element();
        java.lang.Object obj39 = queue35.element();
        boolean b41 = queue35.add((java.lang.Object) (byte) 0);
        java.lang.Object obj42 = queue35.remove();
        boolean b43 = queue28.add(obj42);
        java.lang.Object obj44 = queue28.remove();
        Queue queue45 = new Queue();
        boolean b47 = queue45.add((java.lang.Object) "");
        java.lang.Object obj48 = queue45.element();
        boolean b50 = queue45.add((java.lang.Object) 1);
        Queue queue51 = new Queue();
        boolean b53 = queue51.add((java.lang.Object) 1.0f);
        java.lang.Object obj54 = queue51.remove();
        boolean b56 = queue51.add((java.lang.Object) 1.0d);
        boolean b57 = queue45.add((java.lang.Object) queue51);
        Queue queue58 = new Queue();
        boolean b60 = queue58.add((java.lang.Object) "");
        boolean b62 = queue58.add((java.lang.Object) (-1.0d));
        Queue queue63 = new Queue();
        boolean b65 = queue63.add((java.lang.Object) 1.0f);
        java.lang.Object obj66 = queue63.element();
        boolean b67 = queue58.add((java.lang.Object) queue63);
        boolean b68 = queue51.add((java.lang.Object) b67);
        java.lang.Object obj69 = queue51.element();
        java.lang.Object obj70 = queue51.element();
        boolean b71 = queue28.add(obj70);
        boolean b72 = queue0.add(obj70);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "" + "'", obj5.equals(""));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1.0f + "'", obj15.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1.0f + "'", obj16.equals(1.0f));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "" + "'", obj20.equals(""));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "" + "'", obj21.equals(""));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1.0f + "'", obj26.equals(1.0f));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "" + "'", obj31.equals(""));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "" + "'", obj34.equals(""));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "" + "'", obj38.equals(""));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "" + "'", obj39.equals(""));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "" + "'", obj44.equals(""));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + "" + "'", obj48.equals(""));
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 1.0f + "'", obj54.equals(1.0f));
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 1.0f + "'", obj66.equals(1.0f));
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 1.0d + "'", obj69.equals(1.0d));
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 1.0d + "'", obj70.equals(1.0d));
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) 1.0d);
        boolean b6 = queue0.add((java.lang.Object) (byte) 100);
        java.lang.Object obj7 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        boolean b6 = queue0.add((java.lang.Object) (short) -1);
        java.lang.Object obj7 = queue0.element();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) "");
        boolean b12 = queue8.add((java.lang.Object) (-1.0d));
        boolean b14 = queue8.add((java.lang.Object) (short) -1);
        java.lang.Object obj15 = queue8.element();
        boolean b16 = queue0.add((java.lang.Object) queue8);
        java.lang.Object obj17 = queue0.element();
        java.lang.Object obj18 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "" + "'", obj18.equals(""));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        Queue queue5 = new Queue();
        boolean b6 = queue0.add((java.lang.Object) queue5);
        java.lang.Object obj7 = queue0.element();
        java.lang.Object obj8 = queue0.element();
        java.lang.Object obj9 = queue0.remove();
        Queue queue10 = new Queue();
        boolean b12 = queue10.add((java.lang.Object) "");
        boolean b14 = queue10.add((java.lang.Object) (-1.0d));
        boolean b16 = queue10.add((java.lang.Object) (short) -1);
        java.lang.Object obj17 = queue10.element();
        boolean b18 = queue0.add((java.lang.Object) queue10);
        java.lang.Object obj19 = queue10.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "" + "'", obj8.equals(""));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "" + "'", obj19.equals(""));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        boolean b6 = queue0.add((java.lang.Object) (short) -1);
        java.lang.Object obj7 = queue0.remove();
        boolean b9 = queue0.add((java.lang.Object) 1);
        Queue queue10 = new Queue();
        boolean b12 = queue10.add((java.lang.Object) "");
        boolean b14 = queue10.add((java.lang.Object) (-1.0d));
        java.lang.Object obj15 = queue10.element();
        java.lang.Object obj16 = queue10.element();
        Queue queue17 = new Queue();
        boolean b19 = queue17.add((java.lang.Object) 1.0f);
        Queue queue20 = new Queue();
        boolean b22 = queue20.add((java.lang.Object) "");
        java.lang.Object obj23 = queue20.remove();
        boolean b24 = queue17.add((java.lang.Object) queue20);
        java.lang.Object obj25 = queue17.element();
        java.lang.Object obj26 = queue17.element();
        Queue queue27 = new Queue();
        boolean b29 = queue27.add((java.lang.Object) "");
        java.lang.Object obj30 = queue27.element();
        java.lang.Object obj31 = queue27.element();
        boolean b33 = queue27.add((java.lang.Object) (byte) 0);
        java.lang.Object obj34 = queue27.element();
        boolean b35 = queue17.add((java.lang.Object) queue27);
        java.lang.Object obj36 = queue17.remove();
        boolean b37 = queue10.add(obj36);
        boolean b38 = queue0.add(obj36);
        Queue queue39 = new Queue();
        boolean b41 = queue39.add((java.lang.Object) "");
        java.lang.Object obj42 = queue39.element();
        boolean b44 = queue39.add((java.lang.Object) 1);
        Queue queue45 = new Queue();
        boolean b47 = queue45.add((java.lang.Object) 1.0f);
        java.lang.Object obj48 = queue45.remove();
        boolean b49 = queue39.add((java.lang.Object) queue45);
        boolean b50 = queue0.add((java.lang.Object) b49);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1.0f + "'", obj25.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1.0f + "'", obj26.equals(1.0f));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "" + "'", obj30.equals(""));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "" + "'", obj31.equals(""));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "" + "'", obj34.equals(""));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 1.0f + "'", obj36.equals(1.0f));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 1.0f + "'", obj48.equals(1.0f));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        Queue queue4 = new Queue();
        boolean b6 = queue4.add((java.lang.Object) 1.0f);
        Queue queue7 = new Queue();
        boolean b9 = queue7.add((java.lang.Object) "");
        java.lang.Object obj10 = queue7.remove();
        boolean b11 = queue4.add((java.lang.Object) queue7);
        boolean b12 = queue0.add((java.lang.Object) queue7);
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) "");
        java.lang.Object obj16 = queue13.element();
        java.lang.Object obj17 = queue13.element();
        Queue queue18 = new Queue();
        boolean b19 = queue13.add((java.lang.Object) queue18);
        Queue queue20 = new Queue();
        boolean b21 = queue13.add((java.lang.Object) queue20);
        java.lang.Object obj22 = queue13.remove();
        boolean b23 = queue7.add(obj22);
        java.lang.Object obj24 = queue7.element();
        java.lang.Object obj25 = queue7.remove();
        try {
            java.lang.Object obj26 = queue7.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        Queue queue5 = new Queue();
        boolean b7 = queue5.add((java.lang.Object) 1.0f);
        java.lang.Object obj8 = queue5.element();
        boolean b9 = queue0.add((java.lang.Object) queue5);
        java.lang.Object obj10 = queue0.element();
        boolean b12 = queue0.add((java.lang.Object) 'a');
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        Queue queue5 = new Queue();
        boolean b6 = queue0.add((java.lang.Object) queue5);
        Queue queue7 = new Queue();
        boolean b8 = queue0.add((java.lang.Object) queue7);
        java.lang.Object obj9 = queue0.element();
        Queue queue10 = new Queue();
        boolean b12 = queue10.add((java.lang.Object) "");
        java.lang.Object obj13 = queue10.element();
        java.lang.Object obj14 = queue10.element();
        boolean b16 = queue10.add((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = queue10.remove();
        Queue queue18 = new Queue();
        boolean b20 = queue18.add((java.lang.Object) 1.0f);
        java.lang.Object obj21 = queue18.element();
        java.lang.Object obj22 = queue18.element();
        boolean b24 = queue18.add((java.lang.Object) 100.0f);
        java.lang.Object obj25 = queue18.remove();
        Queue queue26 = new Queue();
        boolean b28 = queue26.add((java.lang.Object) 1.0f);
        Queue queue29 = new Queue();
        boolean b31 = queue29.add((java.lang.Object) "");
        java.lang.Object obj32 = queue29.remove();
        boolean b33 = queue26.add((java.lang.Object) queue29);
        boolean b34 = queue18.add((java.lang.Object) queue26);
        java.lang.Object obj35 = queue18.element();
        Queue queue36 = new Queue();
        boolean b38 = queue36.add((java.lang.Object) 1.0f);
        java.lang.Object obj39 = queue36.element();
        Queue queue40 = new Queue();
        boolean b42 = queue40.add((java.lang.Object) 1.0f);
        Queue queue43 = new Queue();
        boolean b45 = queue43.add((java.lang.Object) "");
        java.lang.Object obj46 = queue43.remove();
        boolean b47 = queue40.add((java.lang.Object) queue43);
        boolean b48 = queue36.add((java.lang.Object) queue43);
        Queue queue49 = new Queue();
        boolean b51 = queue49.add((java.lang.Object) "");
        java.lang.Object obj52 = queue49.element();
        java.lang.Object obj53 = queue49.element();
        Queue queue54 = new Queue();
        boolean b55 = queue49.add((java.lang.Object) queue54);
        Queue queue56 = new Queue();
        boolean b57 = queue49.add((java.lang.Object) queue56);
        java.lang.Object obj58 = queue49.remove();
        boolean b59 = queue43.add(obj58);
        java.lang.Object obj60 = queue43.element();
        java.lang.Object obj61 = queue43.remove();
        boolean b62 = queue18.add(obj61);
        boolean b63 = queue10.add((java.lang.Object) b62);
        java.lang.Object obj64 = queue10.element();
        boolean b65 = queue0.add(obj64);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1.0f + "'", obj21.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1.0f + "'", obj22.equals(1.0f));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1.0f + "'", obj25.equals(1.0f));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "" + "'", obj32.equals(""));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100.0f + "'", obj35.equals(100.0f));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1.0f + "'", obj39.equals(1.0f));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + "" + "'", obj46.equals(""));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + "" + "'", obj52.equals(""));
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + "" + "'", obj53.equals(""));
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + "" + "'", obj58.equals(""));
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + "" + "'", obj60.equals(""));
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + "" + "'", obj61.equals(""));
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (byte) 0 + "'", obj64.equals((byte) 0));
        org.junit.Assert.assertTrue(b65 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        java.lang.Object obj5 = queue0.remove();
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        java.lang.Object obj9 = queue6.element();
        java.lang.Object obj10 = queue6.element();
        Queue queue11 = new Queue();
        boolean b12 = queue6.add((java.lang.Object) queue11);
        Queue queue13 = new Queue();
        boolean b14 = queue6.add((java.lang.Object) queue13);
        boolean b15 = queue0.add((java.lang.Object) b14);
        java.lang.Object obj16 = queue0.element();
        java.lang.Object obj17 = queue0.element();
        java.lang.Object obj18 = queue0.remove();
        try {
            java.lang.Object obj19 = queue0.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + true + "'", obj16.equals(true));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + true + "'", obj17.equals(true));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + true + "'", obj18.equals(true));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) "");
        java.lang.Object obj6 = queue3.remove();
        boolean b7 = queue0.add((java.lang.Object) queue3);
        java.lang.Object obj8 = queue0.element();
        java.lang.Object obj9 = queue0.element();
        Queue queue10 = new Queue();
        boolean b12 = queue10.add((java.lang.Object) "");
        java.lang.Object obj13 = queue10.element();
        java.lang.Object obj14 = queue10.element();
        boolean b16 = queue10.add((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = queue10.element();
        boolean b18 = queue0.add((java.lang.Object) queue10);
        java.lang.Object obj19 = queue0.remove();
        java.lang.Object obj20 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0f + "'", obj19.equals(1.0f));
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        Queue queue5 = new Queue();
        boolean b7 = queue5.add((java.lang.Object) 1.0f);
        java.lang.Object obj8 = queue5.element();
        boolean b9 = queue0.add((java.lang.Object) queue5);
        Queue queue10 = new Queue();
        boolean b12 = queue10.add((java.lang.Object) 1.0f);
        java.lang.Object obj13 = queue10.element();
        boolean b15 = queue10.add((java.lang.Object) (-1.0f));
        boolean b17 = queue10.add((java.lang.Object) 10);
        boolean b18 = queue0.add((java.lang.Object) queue10);
        Queue queue19 = new Queue();
        boolean b21 = queue19.add((java.lang.Object) "");
        boolean b23 = queue19.add((java.lang.Object) (-1.0d));
        Queue queue24 = new Queue();
        boolean b26 = queue24.add((java.lang.Object) 1.0f);
        java.lang.Object obj27 = queue24.element();
        boolean b28 = queue19.add((java.lang.Object) queue24);
        Queue queue29 = new Queue();
        boolean b31 = queue29.add((java.lang.Object) 1.0f);
        java.lang.Object obj32 = queue29.element();
        boolean b34 = queue29.add((java.lang.Object) (-1.0f));
        boolean b36 = queue29.add((java.lang.Object) 10);
        boolean b37 = queue19.add((java.lang.Object) queue29);
        boolean b38 = queue0.add((java.lang.Object) queue29);
        java.lang.Object obj39 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0f + "'", obj13.equals(1.0f));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1.0f + "'", obj27.equals(1.0f));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1.0f + "'", obj32.equals(1.0f));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "" + "'", obj39.equals(""));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj9 = queue6.remove();
        boolean b10 = queue0.add((java.lang.Object) queue6);
        try {
            java.lang.Object obj11 = queue6.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj9 = queue6.remove();
        boolean b11 = queue6.add((java.lang.Object) 1.0d);
        boolean b12 = queue0.add((java.lang.Object) queue6);
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) "");
        java.lang.Object obj16 = queue13.element();
        java.lang.Object obj17 = queue13.remove();
        boolean b18 = queue6.add((java.lang.Object) queue13);
        Queue queue19 = new Queue();
        boolean b21 = queue19.add((java.lang.Object) "");
        java.lang.Object obj22 = queue19.element();
        boolean b24 = queue19.add((java.lang.Object) 1);
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) "");
        boolean b29 = queue25.add((java.lang.Object) (-1.0d));
        boolean b31 = queue25.add((java.lang.Object) (short) -1);
        java.lang.Object obj32 = queue25.remove();
        boolean b34 = queue25.add((java.lang.Object) 1);
        boolean b35 = queue19.add((java.lang.Object) b34);
        boolean b36 = queue6.add((java.lang.Object) queue19);
        java.lang.Object obj37 = queue6.remove();
        java.lang.Object obj38 = queue6.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "" + "'", obj32.equals(""));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 1.0d + "'", obj37.equals(1.0d));
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) 1.0d);
        java.lang.Object obj5 = queue0.element();
        java.lang.Object obj6 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "" + "'", obj5.equals(""));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) 1.0d);
        java.lang.Object obj5 = queue0.element();
        java.lang.Object obj6 = queue0.element();
        java.lang.Object obj7 = queue0.element();
        boolean b9 = queue0.add((java.lang.Object) "");
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "" + "'", obj5.equals(""));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        Queue queue5 = new Queue();
        boolean b7 = queue5.add((java.lang.Object) 1.0f);
        java.lang.Object obj8 = queue5.element();
        boolean b9 = queue0.add((java.lang.Object) queue5);
        java.lang.Object obj10 = queue0.remove();
        boolean b12 = queue0.add((java.lang.Object) 1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        java.lang.Object obj5 = queue0.remove();
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        java.lang.Object obj9 = queue6.element();
        java.lang.Object obj10 = queue6.element();
        Queue queue11 = new Queue();
        boolean b12 = queue6.add((java.lang.Object) queue11);
        Queue queue13 = new Queue();
        boolean b14 = queue6.add((java.lang.Object) queue13);
        boolean b15 = queue0.add((java.lang.Object) b14);
        java.lang.Object obj16 = queue0.element();
        boolean b18 = queue0.add((java.lang.Object) 10L);
        Queue queue19 = new Queue();
        boolean b21 = queue19.add((java.lang.Object) "");
        java.lang.Object obj22 = queue19.element();
        java.lang.Object obj23 = queue19.element();
        java.lang.Object obj24 = queue19.remove();
        boolean b25 = queue0.add((java.lang.Object) queue19);
        Queue queue26 = new Queue();
        boolean b28 = queue26.add((java.lang.Object) 1.0f);
        java.lang.Object obj29 = queue26.remove();
        boolean b31 = queue26.add((java.lang.Object) 1.0d);
        Queue queue32 = new Queue();
        boolean b34 = queue32.add((java.lang.Object) "");
        boolean b36 = queue32.add((java.lang.Object) (-1.0d));
        boolean b38 = queue32.add((java.lang.Object) (short) -1);
        boolean b39 = queue26.add((java.lang.Object) queue32);
        java.lang.Object obj40 = queue26.element();
        boolean b41 = queue0.add((java.lang.Object) queue26);
        java.lang.Object obj42 = queue26.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + true + "'", obj16.equals(true));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1.0f + "'", obj29.equals(1.0f));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1.0d + "'", obj40.equals(1.0d));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1.0d + "'", obj42.equals(1.0d));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        boolean b6 = queue0.add((java.lang.Object) (short) -1);
        java.lang.Object obj7 = queue0.element();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) "");
        boolean b12 = queue8.add((java.lang.Object) (-1.0d));
        boolean b14 = queue8.add((java.lang.Object) (short) -1);
        java.lang.Object obj15 = queue8.element();
        boolean b16 = queue0.add((java.lang.Object) queue8);
        java.lang.Object obj17 = queue0.element();
        Queue queue18 = new Queue();
        boolean b19 = queue0.add((java.lang.Object) queue18);
        java.lang.Object obj20 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "" + "'", obj20.equals(""));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        boolean b6 = queue0.add((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = queue0.remove();
        java.lang.Object obj8 = queue0.element();
        java.lang.Object obj9 = queue0.remove();
        boolean b11 = queue0.add((java.lang.Object) 10.0d);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) 0 + "'", obj8.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 0 + "'", obj9.equals((byte) 0));
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        java.lang.Object obj5 = queue0.remove();
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        java.lang.Object obj9 = queue6.element();
        java.lang.Object obj10 = queue6.element();
        Queue queue11 = new Queue();
        boolean b12 = queue6.add((java.lang.Object) queue11);
        Queue queue13 = new Queue();
        boolean b14 = queue6.add((java.lang.Object) queue13);
        boolean b15 = queue0.add((java.lang.Object) b14);
        boolean b17 = queue0.add((java.lang.Object) (-1L));
        java.lang.Object obj18 = queue0.remove();
        Queue queue19 = new Queue();
        boolean b21 = queue19.add((java.lang.Object) 1.0f);
        java.lang.Object obj22 = queue19.element();
        java.lang.Object obj23 = queue19.element();
        boolean b25 = queue19.add((java.lang.Object) 100.0f);
        java.lang.Object obj26 = queue19.remove();
        Queue queue27 = new Queue();
        boolean b29 = queue27.add((java.lang.Object) 1.0f);
        Queue queue30 = new Queue();
        boolean b32 = queue30.add((java.lang.Object) "");
        java.lang.Object obj33 = queue30.remove();
        boolean b34 = queue27.add((java.lang.Object) queue30);
        boolean b35 = queue19.add((java.lang.Object) queue27);
        java.lang.Object obj36 = queue19.element();
        boolean b37 = queue0.add(obj36);
        java.lang.Object obj38 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + true + "'", obj18.equals(true));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1.0f + "'", obj22.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1.0f + "'", obj23.equals(1.0f));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1.0f + "'", obj26.equals(1.0f));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "" + "'", obj33.equals(""));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100.0f + "'", obj36.equals(100.0f));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (-1L) + "'", obj38.equals((-1L)));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        Queue queue5 = new Queue();
        boolean b6 = queue0.add((java.lang.Object) queue5);
        Queue queue7 = new Queue();
        boolean b8 = queue0.add((java.lang.Object) queue7);
        Queue queue9 = new Queue();
        boolean b11 = queue9.add((java.lang.Object) 1.0f);
        java.lang.Object obj12 = queue9.element();
        java.lang.Object obj13 = queue9.element();
        java.lang.Object obj14 = queue9.remove();
        Queue queue15 = new Queue();
        boolean b17 = queue15.add((java.lang.Object) "");
        java.lang.Object obj18 = queue15.element();
        java.lang.Object obj19 = queue15.element();
        Queue queue20 = new Queue();
        boolean b21 = queue15.add((java.lang.Object) queue20);
        Queue queue22 = new Queue();
        boolean b23 = queue15.add((java.lang.Object) queue22);
        boolean b24 = queue9.add((java.lang.Object) b23);
        java.lang.Object obj25 = queue9.element();
        boolean b27 = queue9.add((java.lang.Object) 10L);
        Queue queue28 = new Queue();
        boolean b30 = queue28.add((java.lang.Object) "");
        java.lang.Object obj31 = queue28.element();
        java.lang.Object obj32 = queue28.element();
        java.lang.Object obj33 = queue28.remove();
        boolean b34 = queue9.add((java.lang.Object) queue28);
        boolean b35 = queue7.add((java.lang.Object) b34);
        Queue queue36 = new Queue();
        boolean b38 = queue36.add((java.lang.Object) "");
        java.lang.Object obj39 = queue36.element();
        java.lang.Object obj40 = queue36.element();
        java.lang.Object obj41 = queue36.remove();
        Queue queue42 = new Queue();
        boolean b44 = queue42.add((java.lang.Object) "");
        java.lang.Object obj45 = queue42.element();
        java.lang.Object obj46 = queue42.element();
        Queue queue47 = new Queue();
        boolean b48 = queue42.add((java.lang.Object) queue47);
        java.lang.Object obj49 = queue42.element();
        Queue queue50 = new Queue();
        boolean b52 = queue50.add((java.lang.Object) 1.0f);
        boolean b53 = queue42.add((java.lang.Object) b52);
        boolean b54 = queue36.add((java.lang.Object) b53);
        boolean b55 = queue7.add((java.lang.Object) queue36);
        java.lang.Object obj56 = queue36.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0f + "'", obj13.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1.0f + "'", obj14.equals(1.0f));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "" + "'", obj18.equals(""));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "" + "'", obj19.equals(""));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + true + "'", obj25.equals(true));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "" + "'", obj31.equals(""));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "" + "'", obj32.equals(""));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "" + "'", obj33.equals(""));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "" + "'", obj39.equals(""));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "" + "'", obj40.equals(""));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + "" + "'", obj41.equals(""));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "" + "'", obj45.equals(""));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + "" + "'", obj46.equals(""));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + "" + "'", obj49.equals(""));
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + true + "'", obj56.equals(true));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.remove();
        boolean b5 = queue0.add((java.lang.Object) 1.0d);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        boolean b10 = queue6.add((java.lang.Object) (-1.0d));
        boolean b12 = queue6.add((java.lang.Object) (short) -1);
        boolean b13 = queue0.add((java.lang.Object) queue6);
        java.lang.Object obj14 = queue0.remove();
        Queue queue15 = new Queue();
        boolean b17 = queue15.add((java.lang.Object) "");
        boolean b19 = queue15.add((java.lang.Object) (-1.0d));
        java.lang.Object obj20 = queue15.remove();
        boolean b21 = queue0.add(obj20);
        java.lang.Object obj22 = queue0.remove();
        java.lang.Object obj23 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1.0d + "'", obj14.equals(1.0d));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "" + "'", obj20.equals(""));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        Queue queue5 = new Queue();
        boolean b6 = queue0.add((java.lang.Object) queue5);
        Queue queue7 = new Queue();
        boolean b8 = queue0.add((java.lang.Object) queue7);
        boolean b10 = queue0.add((java.lang.Object) 1);
        java.lang.Object obj11 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "" + "'", obj11.equals(""));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) 1.0d);
        java.lang.Object obj5 = queue0.element();
        java.lang.Object obj6 = queue0.element();
        java.lang.Object obj7 = queue0.element();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) "");
        boolean b12 = queue8.add((java.lang.Object) (-1.0d));
        java.lang.Object obj13 = queue8.element();
        java.lang.Object obj14 = queue8.element();
        java.lang.Object obj15 = queue8.element();
        boolean b16 = queue0.add(obj15);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "" + "'", obj5.equals(""));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        java.lang.Object obj5 = queue0.remove();
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        java.lang.Object obj9 = queue6.element();
        java.lang.Object obj10 = queue6.element();
        Queue queue11 = new Queue();
        boolean b12 = queue6.add((java.lang.Object) queue11);
        Queue queue13 = new Queue();
        boolean b14 = queue6.add((java.lang.Object) queue13);
        boolean b15 = queue0.add((java.lang.Object) b14);
        java.lang.Object obj16 = queue0.element();
        boolean b18 = queue0.add((java.lang.Object) 10L);
        Queue queue19 = new Queue();
        boolean b21 = queue19.add((java.lang.Object) "");
        java.lang.Object obj22 = queue19.element();
        java.lang.Object obj23 = queue19.element();
        java.lang.Object obj24 = queue19.remove();
        boolean b25 = queue0.add((java.lang.Object) queue19);
        Queue queue26 = new Queue();
        boolean b28 = queue26.add((java.lang.Object) 1.0f);
        java.lang.Object obj29 = queue26.element();
        boolean b31 = queue26.add((java.lang.Object) (-1.0f));
        boolean b33 = queue26.add((java.lang.Object) 10);
        Queue queue34 = new Queue();
        boolean b36 = queue34.add((java.lang.Object) "");
        java.lang.Object obj37 = queue34.element();
        boolean b39 = queue34.add((java.lang.Object) 1);
        Queue queue40 = new Queue();
        boolean b42 = queue40.add((java.lang.Object) "");
        boolean b44 = queue40.add((java.lang.Object) (-1.0d));
        boolean b46 = queue40.add((java.lang.Object) (short) -1);
        java.lang.Object obj47 = queue40.remove();
        boolean b49 = queue40.add((java.lang.Object) 1);
        boolean b50 = queue34.add((java.lang.Object) b49);
        boolean b51 = queue26.add((java.lang.Object) b50);
        boolean b52 = queue0.add((java.lang.Object) b50);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + true + "'", obj16.equals(true));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1.0f + "'", obj29.equals(1.0f));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + "" + "'", obj47.equals(""));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Queue queue0 = new Queue();
        java.lang.Object obj1 = null;
        boolean b2 = queue0.add(obj1);
        java.lang.Object obj3 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = queue0.element();
        java.lang.Object obj7 = queue0.element();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) 1.0f);
        java.lang.Object obj11 = queue8.element();
        boolean b13 = queue8.add((java.lang.Object) (-1.0f));
        boolean b15 = queue8.add((java.lang.Object) 10);
        Queue queue16 = new Queue();
        boolean b18 = queue16.add((java.lang.Object) "");
        java.lang.Object obj19 = queue16.element();
        boolean b21 = queue16.add((java.lang.Object) 1);
        Queue queue22 = new Queue();
        boolean b24 = queue22.add((java.lang.Object) "");
        boolean b26 = queue22.add((java.lang.Object) (-1.0d));
        boolean b28 = queue22.add((java.lang.Object) (short) -1);
        java.lang.Object obj29 = queue22.remove();
        boolean b31 = queue22.add((java.lang.Object) 1);
        boolean b32 = queue16.add((java.lang.Object) b31);
        boolean b33 = queue8.add((java.lang.Object) b32);
        boolean b34 = queue0.add((java.lang.Object) b32);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1.0f + "'", obj11.equals(1.0f));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "" + "'", obj19.equals(""));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) "");
        java.lang.Object obj6 = queue3.remove();
        boolean b7 = queue0.add((java.lang.Object) queue3);
        java.lang.Object obj8 = queue0.element();
        Queue queue9 = new Queue();
        boolean b11 = queue9.add((java.lang.Object) 1.0f);
        java.lang.Object obj12 = queue9.element();
        java.lang.Object obj13 = queue9.element();
        java.lang.Object obj14 = queue9.remove();
        boolean b15 = queue0.add(obj14);
        Queue queue16 = new Queue();
        boolean b18 = queue16.add((java.lang.Object) "");
        java.lang.Object obj19 = queue16.element();
        java.lang.Object obj20 = queue16.element();
        java.lang.Object obj21 = queue16.remove();
        Queue queue22 = new Queue();
        boolean b24 = queue22.add((java.lang.Object) "");
        java.lang.Object obj25 = queue22.element();
        java.lang.Object obj26 = queue22.element();
        Queue queue27 = new Queue();
        boolean b28 = queue22.add((java.lang.Object) queue27);
        java.lang.Object obj29 = queue22.element();
        Queue queue30 = new Queue();
        boolean b32 = queue30.add((java.lang.Object) 1.0f);
        boolean b33 = queue22.add((java.lang.Object) b32);
        boolean b34 = queue16.add((java.lang.Object) b33);
        boolean b36 = queue16.add((java.lang.Object) 100.0d);
        Queue queue37 = new Queue();
        boolean b39 = queue37.add((java.lang.Object) "");
        boolean b41 = queue37.add((java.lang.Object) (-1.0d));
        boolean b43 = queue37.add((java.lang.Object) (short) -1);
        java.lang.Object obj44 = queue37.element();
        Queue queue45 = new Queue();
        boolean b47 = queue45.add((java.lang.Object) "");
        boolean b49 = queue45.add((java.lang.Object) (-1.0d));
        boolean b51 = queue45.add((java.lang.Object) (short) -1);
        java.lang.Object obj52 = queue45.element();
        boolean b53 = queue37.add((java.lang.Object) queue45);
        java.lang.Object obj54 = queue37.element();
        boolean b55 = queue16.add((java.lang.Object) queue37);
        boolean b56 = queue0.add((java.lang.Object) queue37);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0f + "'", obj13.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1.0f + "'", obj14.equals(1.0f));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "" + "'", obj19.equals(""));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "" + "'", obj20.equals(""));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "" + "'", obj21.equals(""));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "" + "'", obj44.equals(""));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + "" + "'", obj52.equals(""));
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + "" + "'", obj54.equals(""));
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue(b56 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        Queue queue5 = new Queue();
        boolean b6 = queue0.add((java.lang.Object) queue5);
        Queue queue7 = new Queue();
        boolean b8 = queue0.add((java.lang.Object) queue7);
        java.lang.Object obj9 = queue0.element();
        java.lang.Object obj10 = queue0.remove();
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) 1.0f);
        Queue queue14 = new Queue();
        boolean b16 = queue14.add((java.lang.Object) "");
        java.lang.Object obj17 = queue14.remove();
        boolean b18 = queue11.add((java.lang.Object) queue14);
        java.lang.Object obj19 = queue11.element();
        java.lang.Object obj20 = queue11.element();
        java.lang.Object obj21 = queue11.remove();
        java.lang.Object obj22 = queue11.element();
        boolean b23 = queue0.add(obj22);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0f + "'", obj19.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 1.0f + "'", obj20.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1.0f + "'", obj21.equals(1.0f));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = queue0.element();
        java.lang.Object obj6 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "" + "'", obj5.equals(""));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        Queue queue5 = new Queue();
        boolean b6 = queue0.add((java.lang.Object) queue5);
        Queue queue7 = new Queue();
        boolean b8 = queue0.add((java.lang.Object) queue7);
        Queue queue9 = new Queue();
        boolean b11 = queue9.add((java.lang.Object) 1.0f);
        java.lang.Object obj12 = queue9.element();
        java.lang.Object obj13 = queue9.element();
        java.lang.Object obj14 = queue9.remove();
        Queue queue15 = new Queue();
        boolean b17 = queue15.add((java.lang.Object) "");
        java.lang.Object obj18 = queue15.element();
        java.lang.Object obj19 = queue15.element();
        Queue queue20 = new Queue();
        boolean b21 = queue15.add((java.lang.Object) queue20);
        Queue queue22 = new Queue();
        boolean b23 = queue15.add((java.lang.Object) queue22);
        boolean b24 = queue9.add((java.lang.Object) b23);
        java.lang.Object obj25 = queue9.element();
        boolean b27 = queue9.add((java.lang.Object) 10L);
        Queue queue28 = new Queue();
        boolean b30 = queue28.add((java.lang.Object) "");
        java.lang.Object obj31 = queue28.element();
        java.lang.Object obj32 = queue28.element();
        java.lang.Object obj33 = queue28.remove();
        boolean b34 = queue9.add((java.lang.Object) queue28);
        boolean b35 = queue7.add((java.lang.Object) b34);
        Queue queue36 = new Queue();
        boolean b38 = queue36.add((java.lang.Object) "");
        java.lang.Object obj39 = queue36.element();
        java.lang.Object obj40 = queue36.element();
        java.lang.Object obj41 = queue36.remove();
        Queue queue42 = new Queue();
        boolean b44 = queue42.add((java.lang.Object) "");
        java.lang.Object obj45 = queue42.element();
        java.lang.Object obj46 = queue42.element();
        Queue queue47 = new Queue();
        boolean b48 = queue42.add((java.lang.Object) queue47);
        java.lang.Object obj49 = queue42.element();
        Queue queue50 = new Queue();
        boolean b52 = queue50.add((java.lang.Object) 1.0f);
        boolean b53 = queue42.add((java.lang.Object) b52);
        boolean b54 = queue36.add((java.lang.Object) b53);
        boolean b55 = queue7.add((java.lang.Object) queue36);
        java.lang.Object obj56 = queue7.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0f + "'", obj13.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1.0f + "'", obj14.equals(1.0f));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "" + "'", obj18.equals(""));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "" + "'", obj19.equals(""));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + true + "'", obj25.equals(true));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "" + "'", obj31.equals(""));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "" + "'", obj32.equals(""));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "" + "'", obj33.equals(""));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "" + "'", obj39.equals(""));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "" + "'", obj40.equals(""));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + "" + "'", obj41.equals(""));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "" + "'", obj45.equals(""));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + "" + "'", obj46.equals(""));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + "" + "'", obj49.equals(""));
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + true + "'", obj56.equals(true));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.remove();
        boolean b6 = queue0.add((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        java.lang.Object obj5 = queue0.remove();
        java.lang.Object obj6 = queue0.remove();
        try {
            java.lang.Object obj7 = queue0.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "" + "'", obj5.equals(""));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (-1.0d) + "'", obj6.equals((-1.0d)));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        Queue queue5 = new Queue();
        boolean b6 = queue0.add((java.lang.Object) queue5);
        Queue queue7 = new Queue();
        boolean b8 = queue0.add((java.lang.Object) queue7);
        java.lang.Object obj9 = queue0.remove();
        boolean b11 = queue0.add((java.lang.Object) (-1));
        Queue queue12 = new Queue();
        boolean b14 = queue12.add((java.lang.Object) "");
        java.lang.Object obj15 = queue12.element();
        java.lang.Object obj16 = queue12.element();
        boolean b18 = queue12.add((java.lang.Object) (byte) 0);
        boolean b20 = queue12.add((java.lang.Object) 100L);
        boolean b21 = queue0.add((java.lang.Object) queue12);
        java.lang.Object obj22 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) "");
        java.lang.Object obj6 = queue3.remove();
        boolean b7 = queue0.add((java.lang.Object) queue3);
        java.lang.Object obj8 = queue0.element();
        java.lang.Object obj9 = queue0.element();
        Queue queue10 = new Queue();
        boolean b12 = queue10.add((java.lang.Object) "");
        java.lang.Object obj13 = queue10.element();
        java.lang.Object obj14 = queue10.element();
        boolean b16 = queue10.add((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = queue10.element();
        boolean b18 = queue0.add((java.lang.Object) queue10);
        Queue queue19 = new Queue();
        boolean b21 = queue19.add((java.lang.Object) 1.0f);
        java.lang.Object obj22 = queue19.remove();
        boolean b24 = queue19.add((java.lang.Object) 1.0d);
        java.lang.Object obj25 = queue19.remove();
        boolean b26 = queue0.add(obj25);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1.0f + "'", obj22.equals(1.0f));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1.0d + "'", obj25.equals(1.0d));
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        Queue queue4 = new Queue();
        boolean b6 = queue4.add((java.lang.Object) 1.0f);
        Queue queue7 = new Queue();
        boolean b9 = queue7.add((java.lang.Object) "");
        java.lang.Object obj10 = queue7.remove();
        boolean b11 = queue4.add((java.lang.Object) queue7);
        boolean b12 = queue0.add((java.lang.Object) queue7);
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) "");
        java.lang.Object obj16 = queue13.element();
        java.lang.Object obj17 = queue13.element();
        Queue queue18 = new Queue();
        boolean b19 = queue13.add((java.lang.Object) queue18);
        Queue queue20 = new Queue();
        boolean b21 = queue13.add((java.lang.Object) queue20);
        java.lang.Object obj22 = queue13.remove();
        boolean b23 = queue7.add(obj22);
        java.lang.Object obj24 = queue7.element();
        java.lang.Object obj25 = queue7.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        java.lang.Object obj6 = queue0.element();
        Queue queue7 = new Queue();
        boolean b9 = queue7.add((java.lang.Object) "");
        java.lang.Object obj10 = queue7.element();
        java.lang.Object obj11 = queue7.element();
        boolean b13 = queue7.add((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = queue7.remove();
        boolean b15 = queue0.add(obj14);
        java.lang.Object obj16 = queue0.remove();
        java.lang.Object obj17 = queue0.remove();
        java.lang.Object obj18 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "" + "'", obj11.equals(""));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1 + "'", obj17.equals(1));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "" + "'", obj18.equals(""));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        java.lang.Object obj5 = queue0.remove();
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        java.lang.Object obj9 = queue6.element();
        java.lang.Object obj10 = queue6.element();
        Queue queue11 = new Queue();
        boolean b12 = queue6.add((java.lang.Object) queue11);
        Queue queue13 = new Queue();
        boolean b14 = queue6.add((java.lang.Object) queue13);
        boolean b15 = queue0.add((java.lang.Object) b14);
        java.lang.Object obj16 = queue0.element();
        boolean b18 = queue0.add((java.lang.Object) 10L);
        Queue queue19 = new Queue();
        boolean b21 = queue19.add((java.lang.Object) "");
        java.lang.Object obj22 = queue19.element();
        java.lang.Object obj23 = queue19.element();
        java.lang.Object obj24 = queue19.remove();
        boolean b25 = queue0.add((java.lang.Object) queue19);
        Queue queue26 = new Queue();
        boolean b28 = queue26.add((java.lang.Object) "");
        java.lang.Object obj29 = queue26.element();
        boolean b31 = queue26.add((java.lang.Object) 1);
        Queue queue32 = new Queue();
        boolean b34 = queue32.add((java.lang.Object) 1.0f);
        java.lang.Object obj35 = queue32.remove();
        boolean b37 = queue32.add((java.lang.Object) 1.0d);
        boolean b38 = queue26.add((java.lang.Object) queue32);
        java.lang.Object obj39 = queue26.element();
        boolean b40 = queue0.add((java.lang.Object) queue26);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + true + "'", obj16.equals(true));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1.0f + "'", obj35.equals(1.0f));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "" + "'", obj39.equals(""));
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.remove();
        Queue queue4 = new Queue();
        boolean b6 = queue4.add((java.lang.Object) 1.0f);
        java.lang.Object obj7 = queue4.element();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) 1.0f);
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) "");
        java.lang.Object obj14 = queue11.remove();
        boolean b15 = queue8.add((java.lang.Object) queue11);
        boolean b16 = queue4.add((java.lang.Object) queue11);
        boolean b17 = queue0.add((java.lang.Object) b16);
        java.lang.Object obj18 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + true + "'", obj18.equals(true));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.remove();
        boolean b5 = queue0.add((java.lang.Object) 1.0d);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        boolean b10 = queue6.add((java.lang.Object) (-1.0d));
        boolean b12 = queue6.add((java.lang.Object) (short) -1);
        boolean b13 = queue0.add((java.lang.Object) queue6);
        Queue queue14 = new Queue();
        boolean b16 = queue14.add((java.lang.Object) "");
        java.lang.Object obj17 = queue14.element();
        boolean b19 = queue14.add((java.lang.Object) 1);
        java.lang.Object obj20 = queue14.element();
        Queue queue21 = new Queue();
        boolean b23 = queue21.add((java.lang.Object) "");
        java.lang.Object obj24 = queue21.element();
        java.lang.Object obj25 = queue21.element();
        boolean b27 = queue21.add((java.lang.Object) (byte) 0);
        java.lang.Object obj28 = queue21.remove();
        boolean b29 = queue14.add(obj28);
        java.lang.Object obj30 = queue14.remove();
        Queue queue31 = new Queue();
        boolean b33 = queue31.add((java.lang.Object) 1.0f);
        java.lang.Object obj34 = queue31.remove();
        boolean b36 = queue31.add((java.lang.Object) 1.0d);
        Queue queue37 = new Queue();
        boolean b39 = queue37.add((java.lang.Object) "");
        boolean b41 = queue37.add((java.lang.Object) (-1.0d));
        boolean b43 = queue37.add((java.lang.Object) (short) -1);
        boolean b44 = queue31.add((java.lang.Object) queue37);
        java.lang.Object obj45 = queue31.remove();
        boolean b46 = queue14.add((java.lang.Object) queue31);
        boolean b47 = queue0.add((java.lang.Object) queue31);
        java.lang.Object obj48 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "" + "'", obj20.equals(""));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "" + "'", obj28.equals(""));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "" + "'", obj30.equals(""));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1.0f + "'", obj34.equals(1.0f));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 1.0d + "'", obj45.equals(1.0d));
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 1.0d + "'", obj48.equals(1.0d));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.remove();
        boolean b5 = queue0.add((java.lang.Object) (byte) 0);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        java.lang.Object obj9 = queue6.element();
        java.lang.Object obj10 = queue6.element();
        boolean b11 = queue0.add(obj10);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.remove();
        boolean b5 = queue0.add((java.lang.Object) 1.0d);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        java.lang.Object obj9 = queue6.element();
        java.lang.Object obj10 = queue6.element();
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) 1.0f);
        Queue queue14 = new Queue();
        boolean b16 = queue14.add((java.lang.Object) "");
        java.lang.Object obj17 = queue14.remove();
        boolean b18 = queue11.add((java.lang.Object) queue14);
        java.lang.Object obj19 = queue11.element();
        java.lang.Object obj20 = queue11.element();
        java.lang.Object obj21 = queue11.remove();
        java.lang.Object obj22 = queue11.element();
        boolean b23 = queue6.add(obj22);
        boolean b24 = queue0.add((java.lang.Object) b23);
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) "");
        boolean b29 = queue25.add((java.lang.Object) (-1.0d));
        Queue queue30 = new Queue();
        boolean b32 = queue30.add((java.lang.Object) 1.0f);
        java.lang.Object obj33 = queue30.element();
        boolean b34 = queue25.add((java.lang.Object) queue30);
        java.lang.Object obj35 = queue30.element();
        boolean b37 = queue30.add((java.lang.Object) "hi!");
        boolean b38 = queue0.add((java.lang.Object) queue30);
        Queue queue39 = new Queue();
        boolean b41 = queue39.add((java.lang.Object) 1.0f);
        java.lang.Object obj42 = queue39.remove();
        boolean b44 = queue39.add((java.lang.Object) 1.0d);
        Queue queue45 = new Queue();
        boolean b47 = queue45.add((java.lang.Object) "");
        boolean b49 = queue45.add((java.lang.Object) (-1.0d));
        boolean b51 = queue45.add((java.lang.Object) (short) -1);
        boolean b52 = queue39.add((java.lang.Object) queue45);
        java.lang.Object obj53 = queue39.remove();
        boolean b54 = queue30.add(obj53);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0f + "'", obj19.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 1.0f + "'", obj20.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1.0f + "'", obj21.equals(1.0f));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1.0f + "'", obj33.equals(1.0f));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1.0f + "'", obj35.equals(1.0f));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1.0f + "'", obj42.equals(1.0f));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 1.0d + "'", obj53.equals(1.0d));
        org.junit.Assert.assertTrue(b54 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        boolean b6 = queue0.add((java.lang.Object) 100.0f);
        boolean b8 = queue0.add((java.lang.Object) 10.0d);
        java.lang.Object obj9 = queue0.element();
        java.lang.Object obj10 = queue0.element();
        boolean b12 = queue0.add((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1.0f + "'", obj10.equals(1.0f));
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        boolean b6 = queue0.add((java.lang.Object) (short) -1);
        java.lang.Object obj7 = queue0.element();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) "");
        boolean b12 = queue8.add((java.lang.Object) (-1.0d));
        boolean b14 = queue8.add((java.lang.Object) (short) -1);
        java.lang.Object obj15 = queue8.element();
        boolean b16 = queue0.add((java.lang.Object) queue8);
        boolean b18 = queue0.add((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        boolean b6 = queue0.add((java.lang.Object) 100.0f);
        java.lang.Object obj7 = queue0.remove();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) 1.0f);
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) "");
        java.lang.Object obj14 = queue11.remove();
        boolean b15 = queue8.add((java.lang.Object) queue11);
        boolean b16 = queue0.add((java.lang.Object) queue8);
        java.lang.Object obj17 = queue0.element();
        Queue queue18 = new Queue();
        boolean b20 = queue18.add((java.lang.Object) 1.0f);
        java.lang.Object obj21 = queue18.element();
        Queue queue22 = new Queue();
        boolean b24 = queue22.add((java.lang.Object) 1.0f);
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) "");
        java.lang.Object obj28 = queue25.remove();
        boolean b29 = queue22.add((java.lang.Object) queue25);
        boolean b30 = queue18.add((java.lang.Object) queue25);
        Queue queue31 = new Queue();
        boolean b33 = queue31.add((java.lang.Object) "");
        java.lang.Object obj34 = queue31.element();
        java.lang.Object obj35 = queue31.element();
        Queue queue36 = new Queue();
        boolean b37 = queue31.add((java.lang.Object) queue36);
        Queue queue38 = new Queue();
        boolean b39 = queue31.add((java.lang.Object) queue38);
        java.lang.Object obj40 = queue31.remove();
        boolean b41 = queue25.add(obj40);
        java.lang.Object obj42 = queue25.element();
        java.lang.Object obj43 = queue25.remove();
        boolean b44 = queue0.add(obj43);
        Queue queue45 = new Queue();
        boolean b47 = queue45.add((java.lang.Object) "");
        java.lang.Object obj48 = queue45.element();
        boolean b50 = queue45.add((java.lang.Object) 1);
        java.lang.Object obj51 = queue45.element();
        Queue queue52 = new Queue();
        boolean b54 = queue52.add((java.lang.Object) "");
        java.lang.Object obj55 = queue52.element();
        java.lang.Object obj56 = queue52.element();
        boolean b58 = queue52.add((java.lang.Object) (byte) 0);
        boolean b59 = queue45.add((java.lang.Object) (byte) 0);
        java.lang.Object obj60 = queue45.remove();
        boolean b61 = queue0.add((java.lang.Object) queue45);
        Queue queue62 = new Queue();
        boolean b64 = queue62.add((java.lang.Object) "");
        java.lang.Object obj65 = queue62.element();
        java.lang.Object obj66 = queue62.element();
        boolean b68 = queue62.add((java.lang.Object) (byte) 0);
        java.lang.Object obj69 = queue62.remove();
        java.lang.Object obj70 = queue62.element();
        java.lang.Object obj71 = queue62.remove();
        boolean b72 = queue45.add(obj71);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100.0f + "'", obj17.equals(100.0f));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1.0f + "'", obj21.equals(1.0f));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "" + "'", obj28.equals(""));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "" + "'", obj34.equals(""));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + "" + "'", obj35.equals(""));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "" + "'", obj40.equals(""));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "" + "'", obj43.equals(""));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + "" + "'", obj48.equals(""));
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + "" + "'", obj51.equals(""));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + "" + "'", obj55.equals(""));
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "" + "'", obj56.equals(""));
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + "" + "'", obj60.equals(""));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + "" + "'", obj65.equals(""));
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + "" + "'", obj66.equals(""));
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + "" + "'", obj69.equals(""));
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + (byte) 0 + "'", obj70.equals((byte) 0));
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + (byte) 0 + "'", obj71.equals((byte) 0));
        org.junit.Assert.assertTrue(b72 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        boolean b6 = queue0.add((java.lang.Object) (short) -1);
        java.lang.Object obj7 = queue0.element();
        java.lang.Object obj8 = queue0.remove();
        java.lang.Object obj9 = queue0.remove();
        java.lang.Object obj10 = queue0.element();
        java.lang.Object obj11 = queue0.remove();
        try {
            java.lang.Object obj12 = queue0.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "" + "'", obj8.equals(""));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1.0d) + "'", obj9.equals((-1.0d)));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) -1 + "'", obj10.equals((short) -1));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (short) -1 + "'", obj11.equals((short) -1));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        java.lang.Object obj6 = queue0.element();
        java.lang.Object obj7 = queue0.remove();
        java.lang.Object obj8 = queue0.remove();
        try {
            java.lang.Object obj9 = queue0.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1 + "'", obj8.equals(1));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) 1.0d);
        boolean b6 = queue0.add((java.lang.Object) (byte) 100);
        java.lang.Object obj7 = queue0.remove();
        java.lang.Object obj8 = queue0.remove();
        java.lang.Object obj9 = queue0.element();
        java.lang.Object obj10 = queue0.remove();
        try {
            java.lang.Object obj11 = queue0.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0d + "'", obj8.equals(1.0d));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (byte) 100 + "'", obj9.equals((byte) 100));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte) 100 + "'", obj10.equals((byte) 100));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        boolean b10 = queue6.add((java.lang.Object) (-1.0d));
        boolean b12 = queue6.add((java.lang.Object) (short) -1);
        java.lang.Object obj13 = queue6.remove();
        boolean b15 = queue6.add((java.lang.Object) 1);
        boolean b16 = queue0.add((java.lang.Object) b15);
        java.lang.Object obj17 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) "");
        java.lang.Object obj6 = queue3.remove();
        boolean b7 = queue0.add((java.lang.Object) queue3);
        java.lang.Object obj8 = queue0.element();
        java.lang.Object obj9 = queue0.element();
        Queue queue10 = new Queue();
        boolean b12 = queue10.add((java.lang.Object) "");
        java.lang.Object obj13 = queue10.element();
        boolean b15 = queue10.add((java.lang.Object) 1);
        java.lang.Object obj16 = queue10.element();
        Queue queue17 = new Queue();
        boolean b19 = queue17.add((java.lang.Object) "");
        java.lang.Object obj20 = queue17.element();
        java.lang.Object obj21 = queue17.element();
        boolean b23 = queue17.add((java.lang.Object) (byte) 0);
        java.lang.Object obj24 = queue17.remove();
        boolean b25 = queue10.add(obj24);
        java.lang.Object obj26 = queue10.element();
        java.lang.Object obj27 = queue10.element();
        boolean b28 = queue0.add((java.lang.Object) queue10);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "" + "'", obj20.equals(""));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "" + "'", obj21.equals(""));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "" + "'", obj27.equals(""));
        org.junit.Assert.assertTrue(b28 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Queue queue0 = new Queue();
        java.lang.Object obj1 = null;
        boolean b2 = queue0.add(obj1);
        java.lang.Object obj3 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) "");
        java.lang.Object obj6 = queue3.remove();
        boolean b7 = queue0.add((java.lang.Object) queue3);
        java.lang.Object obj8 = queue0.element();
        java.lang.Object obj9 = queue0.element();
        Queue queue10 = new Queue();
        boolean b12 = queue10.add((java.lang.Object) "");
        java.lang.Object obj13 = queue10.element();
        java.lang.Object obj14 = queue10.element();
        boolean b16 = queue10.add((java.lang.Object) (byte) 0);
        java.lang.Object obj17 = queue10.element();
        boolean b18 = queue0.add((java.lang.Object) queue10);
        java.lang.Object obj19 = queue0.remove();
        Queue queue20 = new Queue();
        boolean b22 = queue20.add((java.lang.Object) "");
        boolean b24 = queue20.add((java.lang.Object) (-1.0d));
        boolean b26 = queue20.add((java.lang.Object) (short) -1);
        java.lang.Object obj27 = queue20.element();
        java.lang.Object obj28 = queue20.element();
        Queue queue29 = new Queue();
        boolean b31 = queue29.add((java.lang.Object) 1.0f);
        java.lang.Object obj32 = queue29.remove();
        boolean b34 = queue29.add((java.lang.Object) 1.0d);
        Queue queue35 = new Queue();
        boolean b37 = queue35.add((java.lang.Object) "");
        boolean b39 = queue35.add((java.lang.Object) (-1.0d));
        boolean b41 = queue35.add((java.lang.Object) (short) -1);
        boolean b42 = queue29.add((java.lang.Object) queue35);
        boolean b43 = queue20.add((java.lang.Object) b42);
        boolean b44 = queue0.add((java.lang.Object) queue20);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0f + "'", obj19.equals(1.0f));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "" + "'", obj27.equals(""));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "" + "'", obj28.equals(""));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1.0f + "'", obj32.equals(1.0f));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        Queue queue4 = new Queue();
        boolean b6 = queue4.add((java.lang.Object) 1.0f);
        Queue queue7 = new Queue();
        boolean b9 = queue7.add((java.lang.Object) "");
        java.lang.Object obj10 = queue7.remove();
        boolean b11 = queue4.add((java.lang.Object) queue7);
        boolean b12 = queue0.add((java.lang.Object) queue7);
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) "");
        java.lang.Object obj16 = queue13.element();
        java.lang.Object obj17 = queue13.element();
        Queue queue18 = new Queue();
        boolean b19 = queue13.add((java.lang.Object) queue18);
        Queue queue20 = new Queue();
        boolean b21 = queue13.add((java.lang.Object) queue20);
        java.lang.Object obj22 = queue13.remove();
        boolean b23 = queue7.add(obj22);
        java.lang.Object obj24 = queue7.element();
        java.lang.Object obj25 = queue7.remove();
        Queue queue26 = new Queue();
        boolean b28 = queue26.add((java.lang.Object) 1.0f);
        Queue queue29 = new Queue();
        boolean b31 = queue29.add((java.lang.Object) "");
        java.lang.Object obj32 = queue29.remove();
        boolean b33 = queue26.add((java.lang.Object) queue29);
        java.lang.Object obj34 = queue26.element();
        java.lang.Object obj35 = queue26.element();
        java.lang.Object obj36 = queue26.remove();
        java.lang.Object obj37 = queue26.remove();
        boolean b38 = queue7.add(obj37);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "" + "'", obj32.equals(""));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1.0f + "'", obj34.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1.0f + "'", obj35.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 1.0f + "'", obj36.equals(1.0f));
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        boolean b6 = queue0.add((java.lang.Object) 100.0f);
        java.lang.Object obj7 = queue0.remove();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) 1.0f);
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) "");
        java.lang.Object obj14 = queue11.remove();
        boolean b15 = queue8.add((java.lang.Object) queue11);
        boolean b16 = queue0.add((java.lang.Object) queue8);
        java.lang.Object obj17 = queue0.element();
        Queue queue18 = new Queue();
        boolean b20 = queue18.add((java.lang.Object) 1.0f);
        java.lang.Object obj21 = queue18.element();
        Queue queue22 = new Queue();
        boolean b24 = queue22.add((java.lang.Object) 1.0f);
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) "");
        java.lang.Object obj28 = queue25.remove();
        boolean b29 = queue22.add((java.lang.Object) queue25);
        boolean b30 = queue18.add((java.lang.Object) queue25);
        Queue queue31 = new Queue();
        boolean b33 = queue31.add((java.lang.Object) "");
        java.lang.Object obj34 = queue31.element();
        java.lang.Object obj35 = queue31.element();
        Queue queue36 = new Queue();
        boolean b37 = queue31.add((java.lang.Object) queue36);
        Queue queue38 = new Queue();
        boolean b39 = queue31.add((java.lang.Object) queue38);
        java.lang.Object obj40 = queue31.remove();
        boolean b41 = queue25.add(obj40);
        java.lang.Object obj42 = queue25.element();
        java.lang.Object obj43 = queue25.remove();
        boolean b44 = queue0.add(obj43);
        java.lang.Object obj45 = queue0.element();
        Queue queue46 = new Queue();
        boolean b48 = queue46.add((java.lang.Object) "");
        java.lang.Object obj49 = queue46.element();
        java.lang.Object obj50 = queue46.element();
        Queue queue51 = new Queue();
        boolean b52 = queue46.add((java.lang.Object) queue51);
        Queue queue53 = new Queue();
        boolean b54 = queue46.add((java.lang.Object) queue53);
        java.lang.Object obj55 = queue46.remove();
        boolean b57 = queue46.add((java.lang.Object) (-1));
        java.lang.Object obj58 = null;
        boolean b59 = queue46.add(obj58);
        java.lang.Object obj60 = queue46.remove();
        boolean b61 = queue0.add(obj60);
        java.lang.Object obj62 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100.0f + "'", obj17.equals(100.0f));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1.0f + "'", obj21.equals(1.0f));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "" + "'", obj28.equals(""));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "" + "'", obj34.equals(""));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + "" + "'", obj35.equals(""));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "" + "'", obj40.equals(""));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "" + "'", obj43.equals(""));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100.0f + "'", obj45.equals(100.0f));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + "" + "'", obj49.equals(""));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + "" + "'", obj50.equals(""));
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + "" + "'", obj55.equals(""));
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(obj60);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 100.0f + "'", obj62.equals(100.0f));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = queue0.element();
        Queue queue7 = new Queue();
        boolean b9 = queue7.add((java.lang.Object) 1.0f);
        java.lang.Object obj10 = queue7.element();
        java.lang.Object obj11 = queue7.element();
        boolean b13 = queue7.add((java.lang.Object) 100.0f);
        java.lang.Object obj14 = queue7.remove();
        Queue queue15 = new Queue();
        boolean b17 = queue15.add((java.lang.Object) 1.0f);
        Queue queue18 = new Queue();
        boolean b20 = queue18.add((java.lang.Object) "");
        java.lang.Object obj21 = queue18.remove();
        boolean b22 = queue15.add((java.lang.Object) queue18);
        boolean b23 = queue7.add((java.lang.Object) queue15);
        java.lang.Object obj24 = queue7.element();
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) 1.0f);
        java.lang.Object obj28 = queue25.element();
        Queue queue29 = new Queue();
        boolean b31 = queue29.add((java.lang.Object) 1.0f);
        Queue queue32 = new Queue();
        boolean b34 = queue32.add((java.lang.Object) "");
        java.lang.Object obj35 = queue32.remove();
        boolean b36 = queue29.add((java.lang.Object) queue32);
        boolean b37 = queue25.add((java.lang.Object) queue32);
        Queue queue38 = new Queue();
        boolean b40 = queue38.add((java.lang.Object) "");
        java.lang.Object obj41 = queue38.element();
        java.lang.Object obj42 = queue38.element();
        Queue queue43 = new Queue();
        boolean b44 = queue38.add((java.lang.Object) queue43);
        Queue queue45 = new Queue();
        boolean b46 = queue38.add((java.lang.Object) queue45);
        java.lang.Object obj47 = queue38.remove();
        boolean b48 = queue32.add(obj47);
        java.lang.Object obj49 = queue32.element();
        java.lang.Object obj50 = queue32.remove();
        boolean b51 = queue7.add(obj50);
        java.lang.Object obj52 = queue7.element();
        Queue queue53 = new Queue();
        boolean b55 = queue53.add((java.lang.Object) "");
        java.lang.Object obj56 = queue53.element();
        java.lang.Object obj57 = queue53.element();
        java.lang.Object obj58 = queue53.remove();
        Queue queue59 = new Queue();
        boolean b61 = queue59.add((java.lang.Object) "");
        java.lang.Object obj62 = queue59.element();
        java.lang.Object obj63 = queue59.element();
        Queue queue64 = new Queue();
        boolean b65 = queue59.add((java.lang.Object) queue64);
        java.lang.Object obj66 = queue59.element();
        Queue queue67 = new Queue();
        boolean b69 = queue67.add((java.lang.Object) 1.0f);
        boolean b70 = queue59.add((java.lang.Object) b69);
        boolean b71 = queue53.add((java.lang.Object) b70);
        boolean b73 = queue53.add((java.lang.Object) 100.0d);
        boolean b74 = queue7.add((java.lang.Object) queue53);
        boolean b75 = queue0.add((java.lang.Object) queue53);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1.0f + "'", obj10.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1.0f + "'", obj11.equals(1.0f));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1.0f + "'", obj14.equals(1.0f));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "" + "'", obj21.equals(""));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100.0f + "'", obj24.equals(100.0f));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1.0f + "'", obj28.equals(1.0f));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + "" + "'", obj35.equals(""));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + "" + "'", obj41.equals(""));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + "" + "'", obj47.equals(""));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + "" + "'", obj49.equals(""));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + "" + "'", obj50.equals(""));
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 100.0f + "'", obj52.equals(100.0f));
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "" + "'", obj56.equals(""));
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + "" + "'", obj57.equals(""));
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + "" + "'", obj58.equals(""));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + "" + "'", obj62.equals(""));
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + "" + "'", obj63.equals(""));
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + "" + "'", obj66.equals(""));
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b75 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        boolean b6 = queue0.add((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = queue0.remove();
        java.lang.Object obj8 = queue0.element();
        Queue queue9 = new Queue();
        boolean b11 = queue9.add((java.lang.Object) 1.0f);
        java.lang.Object obj12 = queue9.element();
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) 1.0f);
        Queue queue16 = new Queue();
        boolean b18 = queue16.add((java.lang.Object) "");
        java.lang.Object obj19 = queue16.remove();
        boolean b20 = queue13.add((java.lang.Object) queue16);
        boolean b21 = queue9.add((java.lang.Object) queue16);
        Queue queue22 = new Queue();
        boolean b24 = queue22.add((java.lang.Object) "");
        java.lang.Object obj25 = queue22.element();
        java.lang.Object obj26 = queue22.element();
        Queue queue27 = new Queue();
        boolean b28 = queue22.add((java.lang.Object) queue27);
        Queue queue29 = new Queue();
        boolean b30 = queue22.add((java.lang.Object) queue29);
        java.lang.Object obj31 = queue22.remove();
        boolean b32 = queue16.add(obj31);
        java.lang.Object obj33 = queue16.element();
        java.lang.Object obj34 = queue16.remove();
        boolean b35 = queue0.add((java.lang.Object) queue16);
        Queue queue36 = new Queue();
        boolean b38 = queue36.add((java.lang.Object) 1.0f);
        java.lang.Object obj39 = queue36.element();
        java.lang.Object obj40 = queue36.element();
        java.lang.Object obj41 = queue36.remove();
        Queue queue42 = new Queue();
        boolean b44 = queue42.add((java.lang.Object) "");
        java.lang.Object obj45 = queue42.element();
        java.lang.Object obj46 = queue42.element();
        Queue queue47 = new Queue();
        boolean b48 = queue42.add((java.lang.Object) queue47);
        Queue queue49 = new Queue();
        boolean b50 = queue42.add((java.lang.Object) queue49);
        boolean b51 = queue36.add((java.lang.Object) b50);
        boolean b52 = queue16.add((java.lang.Object) b51);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) 0 + "'", obj8.equals((byte) 0));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "" + "'", obj19.equals(""));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "" + "'", obj31.equals(""));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "" + "'", obj33.equals(""));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "" + "'", obj34.equals(""));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1.0f + "'", obj39.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1.0f + "'", obj40.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1.0f + "'", obj41.equals(1.0f));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "" + "'", obj45.equals(""));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + "" + "'", obj46.equals(""));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        boolean b6 = queue0.add((java.lang.Object) 100.0f);
        java.lang.Object obj7 = queue0.remove();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) 1.0f);
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) "");
        java.lang.Object obj14 = queue11.remove();
        boolean b15 = queue8.add((java.lang.Object) queue11);
        boolean b16 = queue0.add((java.lang.Object) queue8);
        java.lang.Object obj17 = queue0.element();
        Queue queue18 = new Queue();
        boolean b20 = queue18.add((java.lang.Object) 1.0f);
        java.lang.Object obj21 = queue18.element();
        Queue queue22 = new Queue();
        boolean b24 = queue22.add((java.lang.Object) 1.0f);
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) "");
        java.lang.Object obj28 = queue25.remove();
        boolean b29 = queue22.add((java.lang.Object) queue25);
        boolean b30 = queue18.add((java.lang.Object) queue25);
        Queue queue31 = new Queue();
        boolean b33 = queue31.add((java.lang.Object) "");
        java.lang.Object obj34 = queue31.element();
        java.lang.Object obj35 = queue31.element();
        Queue queue36 = new Queue();
        boolean b37 = queue31.add((java.lang.Object) queue36);
        Queue queue38 = new Queue();
        boolean b39 = queue31.add((java.lang.Object) queue38);
        java.lang.Object obj40 = queue31.remove();
        boolean b41 = queue25.add(obj40);
        java.lang.Object obj42 = queue25.element();
        java.lang.Object obj43 = queue25.remove();
        boolean b44 = queue0.add(obj43);
        java.lang.Object obj45 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100.0f + "'", obj17.equals(100.0f));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1.0f + "'", obj21.equals(1.0f));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "" + "'", obj28.equals(""));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "" + "'", obj34.equals(""));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + "" + "'", obj35.equals(""));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "" + "'", obj40.equals(""));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "" + "'", obj43.equals(""));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100.0f + "'", obj45.equals(100.0f));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        boolean b6 = queue0.add((java.lang.Object) 100.0f);
        boolean b8 = queue0.add((java.lang.Object) 10.0d);
        Queue queue9 = new Queue();
        boolean b11 = queue9.add((java.lang.Object) "");
        java.lang.Object obj12 = queue9.element();
        boolean b14 = queue9.add((java.lang.Object) 1);
        Queue queue15 = new Queue();
        boolean b17 = queue15.add((java.lang.Object) 1.0f);
        java.lang.Object obj18 = queue15.remove();
        boolean b19 = queue9.add((java.lang.Object) queue15);
        boolean b20 = queue0.add((java.lang.Object) b19);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + "" + "'", obj12.equals(""));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1.0f + "'", obj18.equals(1.0f));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        boolean b6 = queue0.add((java.lang.Object) (short) -1);
        java.lang.Object obj7 = queue0.element();
        java.lang.Object obj8 = queue0.remove();
        java.lang.Object obj9 = queue0.remove();
        Queue queue10 = new Queue();
        boolean b12 = queue10.add((java.lang.Object) 1.0f);
        java.lang.Object obj13 = queue10.element();
        java.lang.Object obj14 = queue10.element();
        java.lang.Object obj15 = queue10.remove();
        Queue queue16 = new Queue();
        boolean b18 = queue16.add((java.lang.Object) "");
        java.lang.Object obj19 = queue16.element();
        java.lang.Object obj20 = queue16.element();
        Queue queue21 = new Queue();
        boolean b22 = queue16.add((java.lang.Object) queue21);
        Queue queue23 = new Queue();
        boolean b24 = queue16.add((java.lang.Object) queue23);
        boolean b25 = queue10.add((java.lang.Object) b24);
        java.lang.Object obj26 = queue10.element();
        java.lang.Object obj27 = queue10.element();
        java.lang.Object obj28 = queue10.remove();
        boolean b29 = queue0.add(obj28);
        java.lang.Object obj30 = queue0.element();
        java.lang.Object obj31 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "" + "'", obj8.equals(""));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1.0d) + "'", obj9.equals((-1.0d)));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0f + "'", obj13.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1.0f + "'", obj14.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1.0f + "'", obj15.equals(1.0f));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "" + "'", obj19.equals(""));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "" + "'", obj20.equals(""));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + true + "'", obj26.equals(true));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + true + "'", obj27.equals(true));
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + true + "'", obj28.equals(true));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short) -1 + "'", obj30.equals((short) -1));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + (short) -1 + "'", obj31.equals((short) -1));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = null;
        boolean b5 = queue0.add(obj4);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) "");
        java.lang.Object obj6 = queue3.remove();
        boolean b7 = queue0.add((java.lang.Object) queue3);
        java.lang.Object obj8 = queue0.element();
        java.lang.Object obj9 = queue0.element();
        java.lang.Object obj10 = queue0.remove();
        java.lang.Object obj11 = queue0.remove();
        Queue queue12 = new Queue();
        boolean b14 = queue12.add((java.lang.Object) "");
        java.lang.Object obj15 = queue12.element();
        boolean b17 = queue12.add((java.lang.Object) 1);
        boolean b18 = queue0.add((java.lang.Object) queue12);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1.0f + "'", obj10.equals(1.0f));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj9 = queue6.remove();
        boolean b10 = queue0.add((java.lang.Object) queue6);
        boolean b12 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj13 = queue6.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0f + "'", obj13.equals(1.0f));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        java.lang.Object obj5 = queue0.remove();
        boolean b7 = queue0.add((java.lang.Object) (byte) 10);
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) 1.0f);
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) "");
        java.lang.Object obj14 = queue11.remove();
        boolean b15 = queue8.add((java.lang.Object) queue11);
        java.lang.Object obj16 = queue8.element();
        java.lang.Object obj17 = queue8.element();
        Queue queue18 = new Queue();
        boolean b20 = queue18.add((java.lang.Object) "");
        java.lang.Object obj21 = queue18.element();
        java.lang.Object obj22 = queue18.element();
        boolean b24 = queue18.add((java.lang.Object) (byte) 0);
        java.lang.Object obj25 = queue18.element();
        boolean b26 = queue8.add((java.lang.Object) queue18);
        java.lang.Object obj27 = queue8.remove();
        boolean b28 = queue0.add((java.lang.Object) queue8);
        java.lang.Object obj29 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1.0f + "'", obj16.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1.0f + "'", obj17.equals(1.0f));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "" + "'", obj21.equals(""));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1.0f + "'", obj27.equals(1.0f));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (byte) 10 + "'", obj29.equals((byte) 10));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj9 = queue6.remove();
        boolean b11 = queue6.add((java.lang.Object) 1.0d);
        boolean b12 = queue0.add((java.lang.Object) queue6);
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) "");
        java.lang.Object obj16 = queue13.element();
        java.lang.Object obj17 = queue13.remove();
        boolean b18 = queue6.add((java.lang.Object) queue13);
        java.lang.Object obj19 = queue6.remove();
        java.lang.Object obj20 = queue6.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0d + "'", obj19.equals(1.0d));
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.remove();
        boolean b5 = queue0.add((java.lang.Object) 1.0d);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        java.lang.Object obj9 = queue6.element();
        java.lang.Object obj10 = queue6.element();
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) 1.0f);
        Queue queue14 = new Queue();
        boolean b16 = queue14.add((java.lang.Object) "");
        java.lang.Object obj17 = queue14.remove();
        boolean b18 = queue11.add((java.lang.Object) queue14);
        java.lang.Object obj19 = queue11.element();
        java.lang.Object obj20 = queue11.element();
        java.lang.Object obj21 = queue11.remove();
        java.lang.Object obj22 = queue11.element();
        boolean b23 = queue6.add(obj22);
        boolean b24 = queue0.add((java.lang.Object) b23);
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) "");
        java.lang.Object obj28 = queue25.element();
        boolean b30 = queue25.add((java.lang.Object) 1);
        Queue queue31 = new Queue();
        boolean b33 = queue31.add((java.lang.Object) 1.0f);
        java.lang.Object obj34 = queue31.remove();
        boolean b36 = queue31.add((java.lang.Object) 1.0d);
        boolean b37 = queue25.add((java.lang.Object) queue31);
        boolean b39 = queue31.add((java.lang.Object) 10.0d);
        boolean b40 = queue0.add((java.lang.Object) b39);
        java.lang.Object obj41 = queue0.element();
        Queue queue42 = new Queue();
        boolean b44 = queue42.add((java.lang.Object) "");
        boolean b46 = queue42.add((java.lang.Object) (-1.0d));
        Queue queue47 = new Queue();
        boolean b49 = queue47.add((java.lang.Object) 1.0f);
        java.lang.Object obj50 = queue47.element();
        boolean b51 = queue42.add((java.lang.Object) queue47);
        boolean b52 = queue0.add((java.lang.Object) queue42);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0f + "'", obj19.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 1.0f + "'", obj20.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1.0f + "'", obj21.equals(1.0f));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "" + "'", obj28.equals(""));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1.0f + "'", obj34.equals(1.0f));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1.0d + "'", obj41.equals(1.0d));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 1.0f + "'", obj50.equals(1.0f));
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b52 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) "");
        java.lang.Object obj6 = queue3.remove();
        boolean b7 = queue0.add((java.lang.Object) queue3);
        boolean b9 = queue3.add((java.lang.Object) 10L);
        java.lang.Object obj10 = queue3.remove();
        try {
            java.lang.Object obj11 = queue3.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 10L + "'", obj10.equals(10L));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        boolean b6 = queue0.add((java.lang.Object) 100.0f);
        java.lang.Object obj7 = queue0.remove();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) 1.0f);
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) "");
        java.lang.Object obj14 = queue11.remove();
        boolean b15 = queue8.add((java.lang.Object) queue11);
        boolean b16 = queue0.add((java.lang.Object) queue8);
        java.lang.Object obj17 = queue0.element();
        Queue queue18 = new Queue();
        boolean b20 = queue18.add((java.lang.Object) 1.0f);
        java.lang.Object obj21 = queue18.element();
        Queue queue22 = new Queue();
        boolean b24 = queue22.add((java.lang.Object) 1.0f);
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) "");
        java.lang.Object obj28 = queue25.remove();
        boolean b29 = queue22.add((java.lang.Object) queue25);
        boolean b30 = queue18.add((java.lang.Object) queue25);
        Queue queue31 = new Queue();
        boolean b33 = queue31.add((java.lang.Object) "");
        java.lang.Object obj34 = queue31.element();
        java.lang.Object obj35 = queue31.element();
        Queue queue36 = new Queue();
        boolean b37 = queue31.add((java.lang.Object) queue36);
        Queue queue38 = new Queue();
        boolean b39 = queue31.add((java.lang.Object) queue38);
        java.lang.Object obj40 = queue31.remove();
        boolean b41 = queue25.add(obj40);
        java.lang.Object obj42 = queue25.element();
        java.lang.Object obj43 = queue25.remove();
        boolean b44 = queue0.add(obj43);
        java.lang.Object obj45 = queue0.element();
        Queue queue46 = new Queue();
        boolean b48 = queue46.add((java.lang.Object) "");
        java.lang.Object obj49 = queue46.element();
        java.lang.Object obj50 = queue46.element();
        java.lang.Object obj51 = queue46.remove();
        Queue queue52 = new Queue();
        boolean b54 = queue52.add((java.lang.Object) "");
        java.lang.Object obj55 = queue52.element();
        java.lang.Object obj56 = queue52.element();
        Queue queue57 = new Queue();
        boolean b58 = queue52.add((java.lang.Object) queue57);
        java.lang.Object obj59 = queue52.element();
        Queue queue60 = new Queue();
        boolean b62 = queue60.add((java.lang.Object) 1.0f);
        boolean b63 = queue52.add((java.lang.Object) b62);
        boolean b64 = queue46.add((java.lang.Object) b63);
        boolean b66 = queue46.add((java.lang.Object) 100.0d);
        boolean b67 = queue0.add((java.lang.Object) queue46);
        java.lang.Object obj68 = queue46.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100.0f + "'", obj17.equals(100.0f));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1.0f + "'", obj21.equals(1.0f));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "" + "'", obj28.equals(""));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "" + "'", obj34.equals(""));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + "" + "'", obj35.equals(""));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "" + "'", obj40.equals(""));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "" + "'", obj43.equals(""));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100.0f + "'", obj45.equals(100.0f));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + "" + "'", obj49.equals(""));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + "" + "'", obj50.equals(""));
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + "" + "'", obj51.equals(""));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + "" + "'", obj55.equals(""));
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "" + "'", obj56.equals(""));
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + "" + "'", obj59.equals(""));
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + true + "'", obj68.equals(true));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) 1.0d);
        boolean b6 = queue0.add((java.lang.Object) (byte) 100);
        java.lang.Object obj7 = queue0.remove();
        java.lang.Object obj8 = queue0.remove();
        Queue queue9 = new Queue();
        boolean b11 = queue9.add((java.lang.Object) "");
        boolean b13 = queue9.add((java.lang.Object) (-1.0d));
        boolean b15 = queue9.add((java.lang.Object) (short) -1);
        java.lang.Object obj16 = queue9.remove();
        boolean b17 = queue0.add((java.lang.Object) queue9);
        java.lang.Object obj18 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0d + "'", obj8.equals(1.0d));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (byte) 100 + "'", obj18.equals((byte) 100));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        Queue queue4 = new Queue();
        boolean b6 = queue4.add((java.lang.Object) 1.0f);
        Queue queue7 = new Queue();
        boolean b9 = queue7.add((java.lang.Object) "");
        java.lang.Object obj10 = queue7.remove();
        boolean b11 = queue4.add((java.lang.Object) queue7);
        boolean b12 = queue0.add((java.lang.Object) queue7);
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) "");
        java.lang.Object obj16 = queue13.element();
        java.lang.Object obj17 = queue13.element();
        Queue queue18 = new Queue();
        boolean b19 = queue13.add((java.lang.Object) queue18);
        Queue queue20 = new Queue();
        boolean b21 = queue13.add((java.lang.Object) queue20);
        java.lang.Object obj22 = queue13.remove();
        boolean b23 = queue7.add(obj22);
        java.lang.Object obj24 = queue7.element();
        java.lang.Object obj25 = queue7.remove();
        try {
            java.lang.Object obj26 = queue7.remove();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        Queue queue5 = new Queue();
        boolean b7 = queue5.add((java.lang.Object) 1.0f);
        java.lang.Object obj8 = queue5.remove();
        boolean b10 = queue5.add((java.lang.Object) 1.0d);
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) "");
        boolean b15 = queue11.add((java.lang.Object) (-1.0d));
        boolean b17 = queue11.add((java.lang.Object) (short) -1);
        boolean b18 = queue5.add((java.lang.Object) queue11);
        boolean b19 = queue0.add((java.lang.Object) b18);
        java.lang.Object obj20 = queue0.remove();
        java.lang.Object obj21 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "" + "'", obj20.equals(""));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (-1.0d) + "'", obj21.equals((-1.0d)));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj9 = queue6.remove();
        boolean b11 = queue6.add((java.lang.Object) 1.0d);
        boolean b12 = queue0.add((java.lang.Object) queue6);
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) "");
        java.lang.Object obj16 = queue13.element();
        java.lang.Object obj17 = queue13.remove();
        boolean b18 = queue6.add((java.lang.Object) queue13);
        Queue queue19 = new Queue();
        boolean b21 = queue19.add((java.lang.Object) "");
        java.lang.Object obj22 = queue19.element();
        boolean b24 = queue19.add((java.lang.Object) 1);
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) "");
        boolean b29 = queue25.add((java.lang.Object) (-1.0d));
        boolean b31 = queue25.add((java.lang.Object) (short) -1);
        java.lang.Object obj32 = queue25.remove();
        boolean b34 = queue25.add((java.lang.Object) 1);
        boolean b35 = queue19.add((java.lang.Object) b34);
        boolean b36 = queue6.add((java.lang.Object) queue19);
        Queue queue37 = new Queue();
        boolean b39 = queue37.add((java.lang.Object) "");
        boolean b41 = queue37.add((java.lang.Object) 1.0d);
        boolean b43 = queue37.add((java.lang.Object) (byte) 100);
        java.lang.Object obj44 = queue37.remove();
        java.lang.Object obj45 = queue37.remove();
        Queue queue46 = new Queue();
        boolean b48 = queue46.add((java.lang.Object) "");
        boolean b50 = queue46.add((java.lang.Object) (-1.0d));
        boolean b52 = queue46.add((java.lang.Object) (short) -1);
        java.lang.Object obj53 = queue46.remove();
        boolean b54 = queue37.add((java.lang.Object) queue46);
        boolean b55 = queue6.add((java.lang.Object) queue37);
        java.lang.Object obj56 = queue6.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "" + "'", obj32.equals(""));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "" + "'", obj44.equals(""));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 1.0d + "'", obj45.equals(1.0d));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + "" + "'", obj53.equals(""));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 1.0d + "'", obj56.equals(1.0d));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.remove();
        try {
            java.lang.Object obj5 = queue0.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        Queue queue5 = new Queue();
        boolean b7 = queue5.add((java.lang.Object) "");
        boolean b9 = queue5.add((java.lang.Object) 1.0d);
        boolean b11 = queue5.add((java.lang.Object) (byte) 100);
        boolean b12 = queue0.add((java.lang.Object) queue5);
        boolean b14 = queue5.add((java.lang.Object) 'a');
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) "");
        java.lang.Object obj6 = queue3.remove();
        boolean b7 = queue0.add((java.lang.Object) queue3);
        java.lang.Object obj8 = queue0.element();
        Queue queue9 = new Queue();
        boolean b11 = queue9.add((java.lang.Object) 1.0f);
        java.lang.Object obj12 = queue9.element();
        java.lang.Object obj13 = queue9.element();
        java.lang.Object obj14 = queue9.remove();
        boolean b15 = queue0.add(obj14);
        java.lang.Object obj16 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 1.0f + "'", obj12.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0f + "'", obj13.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1.0f + "'", obj14.equals(1.0f));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1.0f + "'", obj16.equals(1.0f));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        boolean b6 = queue0.add((java.lang.Object) (short) -1);
        java.lang.Object obj7 = queue0.remove();
        boolean b9 = queue0.add((java.lang.Object) 1);
        java.lang.Object obj10 = queue0.element();
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) "");
        java.lang.Object obj14 = queue11.element();
        boolean b16 = queue11.add((java.lang.Object) 1);
        java.lang.Object obj17 = queue11.element();
        Queue queue18 = new Queue();
        boolean b20 = queue18.add((java.lang.Object) "");
        java.lang.Object obj21 = queue18.element();
        java.lang.Object obj22 = queue18.element();
        boolean b24 = queue18.add((java.lang.Object) (byte) 0);
        java.lang.Object obj25 = queue18.remove();
        boolean b26 = queue11.add(obj25);
        java.lang.Object obj27 = queue11.remove();
        boolean b29 = queue11.add((java.lang.Object) 0);
        java.lang.Object obj30 = queue11.element();
        boolean b31 = queue0.add(obj30);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (-1.0d) + "'", obj10.equals((-1.0d)));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "" + "'", obj21.equals(""));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "" + "'", obj27.equals(""));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 1 + "'", obj30.equals(1));
        org.junit.Assert.assertTrue(b31 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.remove();
        boolean b5 = queue0.add((java.lang.Object) 1.0d);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        java.lang.Object obj9 = queue6.element();
        java.lang.Object obj10 = queue6.element();
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) 1.0f);
        Queue queue14 = new Queue();
        boolean b16 = queue14.add((java.lang.Object) "");
        java.lang.Object obj17 = queue14.remove();
        boolean b18 = queue11.add((java.lang.Object) queue14);
        java.lang.Object obj19 = queue11.element();
        java.lang.Object obj20 = queue11.element();
        java.lang.Object obj21 = queue11.remove();
        java.lang.Object obj22 = queue11.element();
        boolean b23 = queue6.add(obj22);
        boolean b24 = queue0.add((java.lang.Object) b23);
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) "");
        java.lang.Object obj28 = queue25.element();
        boolean b30 = queue25.add((java.lang.Object) 1);
        Queue queue31 = new Queue();
        boolean b33 = queue31.add((java.lang.Object) 1.0f);
        java.lang.Object obj34 = queue31.remove();
        boolean b36 = queue31.add((java.lang.Object) 1.0d);
        boolean b37 = queue25.add((java.lang.Object) queue31);
        boolean b39 = queue31.add((java.lang.Object) 10.0d);
        boolean b40 = queue0.add((java.lang.Object) b39);
        java.lang.Object obj41 = queue0.element();
        Queue queue42 = new Queue();
        boolean b44 = queue42.add((java.lang.Object) 1.0f);
        java.lang.Object obj45 = queue42.element();
        Queue queue46 = new Queue();
        boolean b48 = queue46.add((java.lang.Object) 1.0f);
        Queue queue49 = new Queue();
        boolean b51 = queue49.add((java.lang.Object) "");
        java.lang.Object obj52 = queue49.remove();
        boolean b53 = queue46.add((java.lang.Object) queue49);
        boolean b54 = queue42.add((java.lang.Object) queue49);
        boolean b55 = queue0.add((java.lang.Object) queue49);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0f + "'", obj19.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 1.0f + "'", obj20.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1.0f + "'", obj21.equals(1.0f));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "" + "'", obj28.equals(""));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1.0f + "'", obj34.equals(1.0f));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1.0d + "'", obj41.equals(1.0d));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 1.0f + "'", obj45.equals(1.0f));
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + "" + "'", obj52.equals(""));
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        boolean b6 = queue0.add((java.lang.Object) (byte) 0);
        Queue queue7 = new Queue();
        boolean b9 = queue7.add((java.lang.Object) 1.0f);
        java.lang.Object obj10 = queue7.element();
        java.lang.Object obj11 = queue7.element();
        boolean b13 = queue7.add((java.lang.Object) 100.0f);
        java.lang.Object obj14 = queue7.remove();
        Queue queue15 = new Queue();
        boolean b17 = queue15.add((java.lang.Object) 1.0f);
        Queue queue18 = new Queue();
        boolean b20 = queue18.add((java.lang.Object) "");
        java.lang.Object obj21 = queue18.remove();
        boolean b22 = queue15.add((java.lang.Object) queue18);
        boolean b23 = queue7.add((java.lang.Object) queue15);
        java.lang.Object obj24 = queue7.remove();
        boolean b25 = queue0.add(obj24);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1.0f + "'", obj10.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1.0f + "'", obj11.equals(1.0f));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1.0f + "'", obj14.equals(1.0f));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "" + "'", obj21.equals(""));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100.0f + "'", obj24.equals(100.0f));
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) "");
        java.lang.Object obj6 = queue3.remove();
        boolean b7 = queue0.add((java.lang.Object) queue3);
        boolean b9 = queue3.add((java.lang.Object) 10L);
        java.lang.Object obj10 = queue3.remove();
        try {
            java.lang.Object obj11 = queue3.element();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 10L + "'", obj10.equals(10L));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        Queue queue4 = new Queue();
        boolean b6 = queue4.add((java.lang.Object) 1.0f);
        Queue queue7 = new Queue();
        boolean b9 = queue7.add((java.lang.Object) "");
        java.lang.Object obj10 = queue7.remove();
        boolean b11 = queue4.add((java.lang.Object) queue7);
        boolean b12 = queue0.add((java.lang.Object) queue7);
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) "");
        java.lang.Object obj16 = queue13.element();
        java.lang.Object obj17 = queue13.element();
        Queue queue18 = new Queue();
        boolean b19 = queue13.add((java.lang.Object) queue18);
        Queue queue20 = new Queue();
        boolean b21 = queue13.add((java.lang.Object) queue20);
        java.lang.Object obj22 = queue13.remove();
        boolean b23 = queue7.add(obj22);
        java.lang.Object obj24 = queue7.element();
        java.lang.Object obj25 = queue7.remove();
        java.lang.Object obj26 = null;
        boolean b27 = queue7.add(obj26);
        java.lang.Object obj28 = queue7.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.remove();
        Queue queue4 = new Queue();
        boolean b6 = queue4.add((java.lang.Object) 1.0f);
        java.lang.Object obj7 = queue4.element();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) 1.0f);
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) "");
        java.lang.Object obj14 = queue11.remove();
        boolean b15 = queue8.add((java.lang.Object) queue11);
        boolean b16 = queue4.add((java.lang.Object) queue11);
        boolean b17 = queue0.add((java.lang.Object) b16);
        Queue queue18 = new Queue();
        boolean b20 = queue18.add((java.lang.Object) 1.0f);
        java.lang.Object obj21 = queue18.remove();
        boolean b23 = queue18.add((java.lang.Object) 1.0d);
        boolean b24 = queue0.add((java.lang.Object) b23);
        java.lang.Object obj25 = queue0.element();
        java.lang.Object obj26 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1.0f + "'", obj21.equals(1.0f));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + true + "'", obj25.equals(true));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + true + "'", obj26.equals(true));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.remove();
        boolean b5 = queue0.add((java.lang.Object) 1.0d);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        java.lang.Object obj9 = queue6.element();
        java.lang.Object obj10 = queue6.element();
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) 1.0f);
        Queue queue14 = new Queue();
        boolean b16 = queue14.add((java.lang.Object) "");
        java.lang.Object obj17 = queue14.remove();
        boolean b18 = queue11.add((java.lang.Object) queue14);
        java.lang.Object obj19 = queue11.element();
        java.lang.Object obj20 = queue11.element();
        java.lang.Object obj21 = queue11.remove();
        java.lang.Object obj22 = queue11.element();
        boolean b23 = queue6.add(obj22);
        boolean b24 = queue0.add((java.lang.Object) b23);
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) "");
        boolean b29 = queue25.add((java.lang.Object) (-1.0d));
        Queue queue30 = new Queue();
        boolean b32 = queue30.add((java.lang.Object) 1.0f);
        java.lang.Object obj33 = queue30.element();
        boolean b34 = queue25.add((java.lang.Object) queue30);
        java.lang.Object obj35 = queue30.element();
        boolean b37 = queue30.add((java.lang.Object) "hi!");
        boolean b38 = queue0.add((java.lang.Object) queue30);
        java.lang.Object obj39 = queue30.remove();
        java.lang.Object obj40 = queue30.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0f + "'", obj19.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 1.0f + "'", obj20.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1.0f + "'", obj21.equals(1.0f));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1.0f + "'", obj33.equals(1.0f));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1.0f + "'", obj35.equals(1.0f));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1.0f + "'", obj39.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) 1.0d);
        java.lang.Object obj5 = queue0.element();
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        Queue queue9 = new Queue();
        boolean b11 = queue9.add((java.lang.Object) "");
        boolean b13 = queue9.add((java.lang.Object) 1.0d);
        boolean b15 = queue9.add((java.lang.Object) (byte) 100);
        boolean b16 = queue6.add((java.lang.Object) b15);
        boolean b18 = queue6.add((java.lang.Object) (byte) 1);
        boolean b19 = queue0.add((java.lang.Object) b18);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "" + "'", obj5.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) 1.0d);
        boolean b6 = queue0.add((java.lang.Object) (byte) 100);
        java.lang.Object obj7 = queue0.remove();
        java.lang.Object obj8 = queue0.remove();
        Queue queue9 = new Queue();
        boolean b11 = queue9.add((java.lang.Object) "");
        boolean b13 = queue9.add((java.lang.Object) (-1.0d));
        boolean b15 = queue9.add((java.lang.Object) (short) -1);
        java.lang.Object obj16 = queue9.remove();
        boolean b17 = queue0.add((java.lang.Object) queue9);
        Queue queue18 = new Queue();
        boolean b20 = queue18.add((java.lang.Object) 1.0f);
        java.lang.Object obj21 = queue18.element();
        Queue queue22 = new Queue();
        boolean b24 = queue22.add((java.lang.Object) 1.0f);
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) "");
        java.lang.Object obj28 = queue25.remove();
        boolean b29 = queue22.add((java.lang.Object) queue25);
        boolean b30 = queue18.add((java.lang.Object) queue25);
        Queue queue31 = new Queue();
        boolean b33 = queue31.add((java.lang.Object) "");
        java.lang.Object obj34 = queue31.element();
        java.lang.Object obj35 = queue31.element();
        Queue queue36 = new Queue();
        boolean b37 = queue31.add((java.lang.Object) queue36);
        Queue queue38 = new Queue();
        boolean b39 = queue31.add((java.lang.Object) queue38);
        java.lang.Object obj40 = queue31.remove();
        boolean b41 = queue25.add(obj40);
        boolean b42 = queue0.add(obj40);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0d + "'", obj8.equals(1.0d));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1.0f + "'", obj21.equals(1.0f));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "" + "'", obj28.equals(""));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "" + "'", obj34.equals(""));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + "" + "'", obj35.equals(""));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "" + "'", obj40.equals(""));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b42 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        boolean b6 = queue0.add((java.lang.Object) 100.0f);
        java.lang.Object obj7 = queue0.remove();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) 1.0f);
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) "");
        java.lang.Object obj14 = queue11.remove();
        boolean b15 = queue8.add((java.lang.Object) queue11);
        boolean b16 = queue0.add((java.lang.Object) queue8);
        Queue queue17 = new Queue();
        boolean b19 = queue17.add((java.lang.Object) 1.0f);
        java.lang.Object obj20 = queue17.element();
        java.lang.Object obj21 = queue17.element();
        java.lang.Object obj22 = queue17.remove();
        boolean b24 = queue17.add((java.lang.Object) (byte) 10);
        boolean b25 = queue0.add((java.lang.Object) queue17);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 1.0f + "'", obj20.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1.0f + "'", obj21.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 1.0f + "'", obj22.equals(1.0f));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj9 = queue6.remove();
        boolean b11 = queue6.add((java.lang.Object) 1.0d);
        boolean b12 = queue0.add((java.lang.Object) queue6);
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) "");
        java.lang.Object obj16 = queue13.element();
        java.lang.Object obj17 = queue13.remove();
        boolean b18 = queue6.add((java.lang.Object) queue13);
        Queue queue19 = new Queue();
        boolean b21 = queue19.add((java.lang.Object) "");
        java.lang.Object obj22 = queue19.element();
        boolean b24 = queue19.add((java.lang.Object) 1);
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) "");
        boolean b29 = queue25.add((java.lang.Object) (-1.0d));
        boolean b31 = queue25.add((java.lang.Object) (short) -1);
        java.lang.Object obj32 = queue25.remove();
        boolean b34 = queue25.add((java.lang.Object) 1);
        boolean b35 = queue19.add((java.lang.Object) b34);
        boolean b36 = queue6.add((java.lang.Object) queue19);
        Queue queue37 = new Queue();
        boolean b39 = queue37.add((java.lang.Object) 1.0f);
        java.lang.Object obj40 = queue37.element();
        java.lang.Object obj41 = queue37.element();
        boolean b43 = queue37.add((java.lang.Object) 100.0f);
        java.lang.Object obj44 = queue37.remove();
        Queue queue45 = new Queue();
        boolean b47 = queue45.add((java.lang.Object) 1.0f);
        Queue queue48 = new Queue();
        boolean b50 = queue48.add((java.lang.Object) "");
        java.lang.Object obj51 = queue48.remove();
        boolean b52 = queue45.add((java.lang.Object) queue48);
        boolean b53 = queue37.add((java.lang.Object) queue45);
        java.lang.Object obj54 = queue37.element();
        Queue queue55 = new Queue();
        boolean b57 = queue55.add((java.lang.Object) 1.0f);
        java.lang.Object obj58 = queue55.element();
        Queue queue59 = new Queue();
        boolean b61 = queue59.add((java.lang.Object) 1.0f);
        Queue queue62 = new Queue();
        boolean b64 = queue62.add((java.lang.Object) "");
        java.lang.Object obj65 = queue62.remove();
        boolean b66 = queue59.add((java.lang.Object) queue62);
        boolean b67 = queue55.add((java.lang.Object) queue62);
        Queue queue68 = new Queue();
        boolean b70 = queue68.add((java.lang.Object) "");
        java.lang.Object obj71 = queue68.element();
        java.lang.Object obj72 = queue68.element();
        Queue queue73 = new Queue();
        boolean b74 = queue68.add((java.lang.Object) queue73);
        Queue queue75 = new Queue();
        boolean b76 = queue68.add((java.lang.Object) queue75);
        java.lang.Object obj77 = queue68.remove();
        boolean b78 = queue62.add(obj77);
        java.lang.Object obj79 = queue62.element();
        java.lang.Object obj80 = queue62.remove();
        boolean b81 = queue37.add(obj80);
        boolean b82 = queue19.add(obj80);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "" + "'", obj32.equals(""));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 1.0f + "'", obj40.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1.0f + "'", obj41.equals(1.0f));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1.0f + "'", obj44.equals(1.0f));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + "" + "'", obj51.equals(""));
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 100.0f + "'", obj54.equals(100.0f));
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 1.0f + "'", obj58.equals(1.0f));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + "" + "'", obj65.equals(""));
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + "" + "'", obj71.equals(""));
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + "" + "'", obj72.equals(""));
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + "" + "'", obj77.equals(""));
        org.junit.Assert.assertTrue(b78 == true);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + "" + "'", obj79.equals(""));
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + "" + "'", obj80.equals(""));
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue(b82 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        Queue queue5 = new Queue();
        boolean b6 = queue0.add((java.lang.Object) queue5);
        Queue queue7 = new Queue();
        boolean b8 = queue0.add((java.lang.Object) queue7);
        boolean b10 = queue0.add((java.lang.Object) 1);
        java.lang.Object obj11 = queue0.element();
        java.lang.Object obj12 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "" + "'", obj11.equals(""));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + "" + "'", obj12.equals(""));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        boolean b6 = queue0.add((java.lang.Object) (short) -1);
        java.lang.Object obj7 = queue0.element();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) "");
        boolean b12 = queue8.add((java.lang.Object) (-1.0d));
        boolean b14 = queue8.add((java.lang.Object) (short) -1);
        java.lang.Object obj15 = queue8.element();
        boolean b16 = queue0.add((java.lang.Object) queue8);
        java.lang.Object obj17 = queue8.remove();
        Queue queue18 = new Queue();
        boolean b20 = queue18.add((java.lang.Object) 1.0f);
        Queue queue21 = new Queue();
        boolean b23 = queue21.add((java.lang.Object) "");
        java.lang.Object obj24 = queue21.remove();
        boolean b25 = queue18.add((java.lang.Object) queue21);
        java.lang.Object obj26 = queue18.element();
        Queue queue27 = new Queue();
        boolean b29 = queue27.add((java.lang.Object) 1.0f);
        java.lang.Object obj30 = queue27.element();
        java.lang.Object obj31 = queue27.element();
        java.lang.Object obj32 = queue27.remove();
        boolean b33 = queue18.add(obj32);
        boolean b34 = queue8.add((java.lang.Object) b33);
        java.lang.Object obj35 = queue8.remove();
        java.lang.Object obj36 = queue8.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1.0f + "'", obj26.equals(1.0f));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 1.0f + "'", obj30.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 1.0f + "'", obj31.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1.0f + "'", obj32.equals(1.0f));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + (-1.0d) + "'", obj35.equals((-1.0d)));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (short) -1 + "'", obj36.equals((short) -1));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj9 = queue6.remove();
        boolean b11 = queue6.add((java.lang.Object) 1.0d);
        boolean b12 = queue0.add((java.lang.Object) queue6);
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) "");
        java.lang.Object obj16 = queue13.element();
        java.lang.Object obj17 = queue13.remove();
        boolean b18 = queue6.add((java.lang.Object) queue13);
        Queue queue19 = new Queue();
        boolean b21 = queue19.add((java.lang.Object) "");
        java.lang.Object obj22 = queue19.element();
        boolean b24 = queue19.add((java.lang.Object) 1);
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) "");
        boolean b29 = queue25.add((java.lang.Object) (-1.0d));
        boolean b31 = queue25.add((java.lang.Object) (short) -1);
        java.lang.Object obj32 = queue25.remove();
        boolean b34 = queue25.add((java.lang.Object) 1);
        boolean b35 = queue19.add((java.lang.Object) b34);
        boolean b36 = queue6.add((java.lang.Object) queue19);
        boolean b38 = queue19.add((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "" + "'", obj32.equals(""));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj9 = queue6.remove();
        boolean b11 = queue6.add((java.lang.Object) 1.0d);
        boolean b12 = queue0.add((java.lang.Object) queue6);
        java.lang.Object obj13 = queue0.element();
        Queue queue14 = new Queue();
        boolean b16 = queue14.add((java.lang.Object) 1.0f);
        java.lang.Object obj17 = queue14.element();
        Queue queue18 = new Queue();
        boolean b20 = queue18.add((java.lang.Object) 1.0f);
        Queue queue21 = new Queue();
        boolean b23 = queue21.add((java.lang.Object) "");
        java.lang.Object obj24 = queue21.remove();
        boolean b25 = queue18.add((java.lang.Object) queue21);
        boolean b26 = queue14.add((java.lang.Object) queue21);
        Queue queue27 = new Queue();
        boolean b29 = queue27.add((java.lang.Object) "");
        java.lang.Object obj30 = queue27.element();
        java.lang.Object obj31 = queue27.element();
        Queue queue32 = new Queue();
        boolean b33 = queue27.add((java.lang.Object) queue32);
        Queue queue34 = new Queue();
        boolean b35 = queue27.add((java.lang.Object) queue34);
        java.lang.Object obj36 = queue27.remove();
        boolean b37 = queue21.add(obj36);
        java.lang.Object obj38 = queue21.element();
        Queue queue39 = new Queue();
        boolean b41 = queue39.add((java.lang.Object) "");
        boolean b43 = queue39.add((java.lang.Object) (-1.0d));
        boolean b45 = queue39.add((java.lang.Object) (short) -1);
        boolean b46 = queue21.add((java.lang.Object) (short) -1);
        boolean b47 = queue0.add((java.lang.Object) b46);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1.0f + "'", obj17.equals(1.0f));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "" + "'", obj30.equals(""));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "" + "'", obj31.equals(""));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + "" + "'", obj36.equals(""));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "" + "'", obj38.equals(""));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        java.lang.Object obj6 = queue0.element();
        Queue queue7 = new Queue();
        boolean b9 = queue7.add((java.lang.Object) "");
        java.lang.Object obj10 = queue7.element();
        java.lang.Object obj11 = queue7.element();
        boolean b13 = queue7.add((java.lang.Object) (byte) 0);
        boolean b14 = queue0.add((java.lang.Object) (byte) 0);
        Queue queue15 = new Queue();
        boolean b17 = queue15.add((java.lang.Object) "");
        java.lang.Object obj18 = queue15.element();
        java.lang.Object obj19 = queue15.element();
        Queue queue20 = new Queue();
        boolean b21 = queue15.add((java.lang.Object) queue20);
        Queue queue22 = new Queue();
        boolean b23 = queue15.add((java.lang.Object) queue22);
        java.lang.Object obj24 = queue15.remove();
        boolean b25 = queue0.add(obj24);
        java.lang.Object obj26 = queue0.remove();
        java.lang.Object obj27 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "" + "'", obj11.equals(""));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "" + "'", obj18.equals(""));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "" + "'", obj19.equals(""));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1 + "'", obj27.equals(1));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) (-1.0f));
        boolean b7 = queue0.add((java.lang.Object) 10);
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) "");
        java.lang.Object obj11 = queue8.element();
        boolean b13 = queue8.add((java.lang.Object) 1);
        Queue queue14 = new Queue();
        boolean b16 = queue14.add((java.lang.Object) "");
        boolean b18 = queue14.add((java.lang.Object) (-1.0d));
        boolean b20 = queue14.add((java.lang.Object) (short) -1);
        java.lang.Object obj21 = queue14.remove();
        boolean b23 = queue14.add((java.lang.Object) 1);
        boolean b24 = queue8.add((java.lang.Object) b23);
        boolean b25 = queue0.add((java.lang.Object) b24);
        java.lang.Object obj26 = queue0.remove();
        java.lang.Object obj27 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "" + "'", obj11.equals(""));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "" + "'", obj21.equals(""));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1.0f + "'", obj26.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + (-1.0f) + "'", obj27.equals((-1.0f)));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) (-1.0f));
        boolean b7 = queue0.add((java.lang.Object) 10);
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) "");
        boolean b12 = queue8.add((java.lang.Object) (-1.0d));
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) 1.0f);
        java.lang.Object obj16 = queue13.element();
        boolean b17 = queue8.add((java.lang.Object) queue13);
        java.lang.Object obj18 = queue13.element();
        boolean b19 = queue0.add(obj18);
        java.lang.Object obj20 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1.0f + "'", obj16.equals(1.0f));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1.0f + "'", obj18.equals(1.0f));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 1.0f + "'", obj20.equals(1.0f));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        Queue queue5 = new Queue();
        boolean b6 = queue0.add((java.lang.Object) queue5);
        Queue queue7 = new Queue();
        boolean b8 = queue0.add((java.lang.Object) queue7);
        java.lang.Object obj9 = queue0.remove();
        boolean b11 = queue0.add((java.lang.Object) (-1));
        Queue queue12 = new Queue();
        boolean b14 = queue12.add((java.lang.Object) "");
        java.lang.Object obj15 = queue12.element();
        java.lang.Object obj16 = queue12.element();
        boolean b18 = queue12.add((java.lang.Object) (byte) 0);
        boolean b20 = queue12.add((java.lang.Object) 100L);
        boolean b21 = queue0.add((java.lang.Object) queue12);
        boolean b23 = queue12.add((java.lang.Object) 'a');
        boolean b25 = queue12.add((java.lang.Object) 100.0f);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        Queue queue5 = new Queue();
        boolean b7 = queue5.add((java.lang.Object) 1.0f);
        java.lang.Object obj8 = queue5.element();
        boolean b9 = queue0.add((java.lang.Object) queue5);
        java.lang.Object obj10 = queue5.element();
        java.lang.Object obj11 = queue5.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1.0f + "'", obj10.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1.0f + "'", obj11.equals(1.0f));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        boolean b6 = queue0.add((java.lang.Object) (byte) 0);
        boolean b8 = queue0.add((java.lang.Object) 100L);
        java.lang.Object obj9 = queue0.element();
        java.lang.Object obj10 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) (-1.0f));
        boolean b7 = queue0.add((java.lang.Object) 10);
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) "");
        boolean b12 = queue8.add((java.lang.Object) (-1.0d));
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) 1.0f);
        java.lang.Object obj16 = queue13.element();
        boolean b17 = queue8.add((java.lang.Object) queue13);
        java.lang.Object obj18 = queue13.element();
        boolean b19 = queue0.add(obj18);
        Queue queue20 = new Queue();
        boolean b22 = queue20.add((java.lang.Object) "");
        java.lang.Object obj23 = queue20.element();
        boolean b25 = queue20.add((java.lang.Object) 1);
        Queue queue26 = new Queue();
        boolean b28 = queue26.add((java.lang.Object) 1.0f);
        java.lang.Object obj29 = queue26.remove();
        boolean b31 = queue26.add((java.lang.Object) 1.0d);
        boolean b32 = queue20.add((java.lang.Object) queue26);
        Queue queue33 = new Queue();
        boolean b35 = queue33.add((java.lang.Object) "");
        java.lang.Object obj36 = queue33.element();
        java.lang.Object obj37 = queue33.remove();
        boolean b38 = queue26.add((java.lang.Object) queue33);
        Queue queue39 = new Queue();
        boolean b41 = queue39.add((java.lang.Object) "");
        java.lang.Object obj42 = queue39.element();
        java.lang.Object obj43 = queue39.element();
        Queue queue44 = new Queue();
        boolean b45 = queue39.add((java.lang.Object) queue44);
        java.lang.Object obj46 = queue39.element();
        java.lang.Object obj47 = queue39.remove();
        java.lang.Object obj48 = queue39.element();
        java.lang.Object obj49 = queue39.remove();
        boolean b50 = queue26.add(obj49);
        boolean b51 = queue0.add(obj49);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1.0f + "'", obj16.equals(1.0f));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1.0f + "'", obj18.equals(1.0f));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 1.0f + "'", obj29.equals(1.0f));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + "" + "'", obj36.equals(""));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "" + "'", obj43.equals(""));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + "" + "'", obj46.equals(""));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + "" + "'", obj47.equals(""));
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj9 = queue6.remove();
        boolean b11 = queue6.add((java.lang.Object) 1.0d);
        boolean b12 = queue0.add((java.lang.Object) queue6);
        boolean b14 = queue6.add((java.lang.Object) 10.0d);
        Queue queue15 = new Queue();
        boolean b17 = queue15.add((java.lang.Object) "");
        java.lang.Object obj18 = queue15.element();
        boolean b20 = queue15.add((java.lang.Object) 1);
        java.lang.Object obj21 = queue15.element();
        Queue queue22 = new Queue();
        boolean b24 = queue22.add((java.lang.Object) "");
        java.lang.Object obj25 = queue22.element();
        java.lang.Object obj26 = queue22.element();
        boolean b28 = queue22.add((java.lang.Object) (byte) 0);
        java.lang.Object obj29 = queue22.remove();
        boolean b30 = queue15.add(obj29);
        java.lang.Object obj31 = queue15.remove();
        Queue queue32 = new Queue();
        boolean b34 = queue32.add((java.lang.Object) "");
        java.lang.Object obj35 = queue32.element();
        boolean b37 = queue32.add((java.lang.Object) 1);
        Queue queue38 = new Queue();
        boolean b40 = queue38.add((java.lang.Object) 1.0f);
        java.lang.Object obj41 = queue38.remove();
        boolean b43 = queue38.add((java.lang.Object) 1.0d);
        boolean b44 = queue32.add((java.lang.Object) queue38);
        Queue queue45 = new Queue();
        boolean b47 = queue45.add((java.lang.Object) "");
        boolean b49 = queue45.add((java.lang.Object) (-1.0d));
        Queue queue50 = new Queue();
        boolean b52 = queue50.add((java.lang.Object) 1.0f);
        java.lang.Object obj53 = queue50.element();
        boolean b54 = queue45.add((java.lang.Object) queue50);
        boolean b55 = queue38.add((java.lang.Object) b54);
        java.lang.Object obj56 = queue38.element();
        java.lang.Object obj57 = queue38.element();
        boolean b58 = queue15.add(obj57);
        boolean b59 = queue6.add((java.lang.Object) queue15);
        Queue queue60 = new Queue();
        boolean b62 = queue60.add((java.lang.Object) "");
        java.lang.Object obj63 = queue60.element();
        boolean b65 = queue60.add((java.lang.Object) 1);
        java.lang.Object obj66 = queue60.element();
        java.lang.Object obj67 = queue60.remove();
        java.lang.Object obj68 = queue60.remove();
        boolean b69 = queue15.add((java.lang.Object) queue60);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "" + "'", obj18.equals(""));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "" + "'", obj21.equals(""));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "" + "'", obj31.equals(""));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + "" + "'", obj35.equals(""));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1.0f + "'", obj41.equals(1.0f));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 1.0f + "'", obj53.equals(1.0f));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 1.0d + "'", obj56.equals(1.0d));
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 1.0d + "'", obj57.equals(1.0d));
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + "" + "'", obj63.equals(""));
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + "" + "'", obj66.equals(""));
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + "" + "'", obj67.equals(""));
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 1 + "'", obj68.equals(1));
        org.junit.Assert.assertTrue(b69 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) (-1.0f));
        java.lang.Object obj6 = queue0.element();
        java.lang.Object obj7 = queue0.element();
        java.lang.Object obj8 = queue0.element();
        java.lang.Object obj9 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        Queue queue5 = new Queue();
        boolean b6 = queue0.add((java.lang.Object) queue5);
        java.lang.Object obj7 = queue0.element();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) "");
        boolean b12 = queue8.add((java.lang.Object) (-1.0d));
        java.lang.Object obj13 = queue8.element();
        java.lang.Object obj14 = queue8.element();
        Queue queue15 = new Queue();
        boolean b17 = queue15.add((java.lang.Object) 1.0f);
        Queue queue18 = new Queue();
        boolean b20 = queue18.add((java.lang.Object) "");
        java.lang.Object obj21 = queue18.remove();
        boolean b22 = queue15.add((java.lang.Object) queue18);
        java.lang.Object obj23 = queue15.element();
        java.lang.Object obj24 = queue15.element();
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) "");
        java.lang.Object obj28 = queue25.element();
        java.lang.Object obj29 = queue25.element();
        boolean b31 = queue25.add((java.lang.Object) (byte) 0);
        java.lang.Object obj32 = queue25.element();
        boolean b33 = queue15.add((java.lang.Object) queue25);
        java.lang.Object obj34 = queue15.remove();
        boolean b35 = queue8.add(obj34);
        java.lang.Object obj36 = queue8.element();
        boolean b37 = queue0.add((java.lang.Object) queue8);
        java.lang.Object obj38 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "" + "'", obj21.equals(""));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1.0f + "'", obj23.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 1.0f + "'", obj24.equals(1.0f));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "" + "'", obj28.equals(""));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "" + "'", obj32.equals(""));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1.0f + "'", obj34.equals(1.0f));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + "" + "'", obj36.equals(""));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "" + "'", obj38.equals(""));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        Queue queue5 = new Queue();
        boolean b7 = queue5.add((java.lang.Object) 1.0f);
        java.lang.Object obj8 = queue5.element();
        boolean b9 = queue0.add((java.lang.Object) queue5);
        java.lang.Object obj10 = queue5.element();
        java.lang.Object obj11 = queue5.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1.0f + "'", obj10.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 1.0f + "'", obj11.equals(1.0f));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        java.lang.Object obj5 = queue0.remove();
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        java.lang.Object obj9 = queue6.element();
        java.lang.Object obj10 = queue6.element();
        Queue queue11 = new Queue();
        boolean b12 = queue6.add((java.lang.Object) queue11);
        java.lang.Object obj13 = queue6.element();
        Queue queue14 = new Queue();
        boolean b16 = queue14.add((java.lang.Object) 1.0f);
        boolean b17 = queue6.add((java.lang.Object) b16);
        boolean b18 = queue0.add((java.lang.Object) b17);
        boolean b20 = queue0.add((java.lang.Object) 100.0d);
        Queue queue21 = new Queue();
        boolean b23 = queue21.add((java.lang.Object) "");
        boolean b25 = queue21.add((java.lang.Object) (-1.0d));
        boolean b27 = queue21.add((java.lang.Object) (short) -1);
        java.lang.Object obj28 = queue21.element();
        Queue queue29 = new Queue();
        boolean b31 = queue29.add((java.lang.Object) "");
        boolean b33 = queue29.add((java.lang.Object) (-1.0d));
        boolean b35 = queue29.add((java.lang.Object) (short) -1);
        java.lang.Object obj36 = queue29.element();
        boolean b37 = queue21.add((java.lang.Object) queue29);
        java.lang.Object obj38 = queue21.element();
        boolean b39 = queue0.add((java.lang.Object) queue21);
        Queue queue40 = new Queue();
        boolean b42 = queue40.add((java.lang.Object) 1.0f);
        Queue queue43 = new Queue();
        boolean b45 = queue43.add((java.lang.Object) "");
        java.lang.Object obj46 = queue43.remove();
        boolean b47 = queue40.add((java.lang.Object) queue43);
        java.lang.Object obj48 = queue40.element();
        java.lang.Object obj49 = queue40.element();
        java.lang.Object obj50 = queue40.remove();
        java.lang.Object obj51 = queue40.remove();
        boolean b52 = queue0.add(obj51);
        java.lang.Object obj53 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "" + "'", obj5.equals(""));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "" + "'", obj28.equals(""));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + "" + "'", obj36.equals(""));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "" + "'", obj38.equals(""));
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + "" + "'", obj46.equals(""));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 1.0f + "'", obj48.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 1.0f + "'", obj49.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 1.0f + "'", obj50.equals(1.0f));
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + true + "'", obj53.equals(true));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.remove();
        boolean b5 = queue0.add((java.lang.Object) 1.0d);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        boolean b10 = queue6.add((java.lang.Object) (-1.0d));
        boolean b12 = queue6.add((java.lang.Object) (short) -1);
        boolean b13 = queue0.add((java.lang.Object) queue6);
        java.lang.Object obj14 = queue0.remove();
        Queue queue15 = new Queue();
        boolean b17 = queue15.add((java.lang.Object) "");
        boolean b19 = queue15.add((java.lang.Object) (-1.0d));
        java.lang.Object obj20 = queue15.remove();
        boolean b21 = queue0.add(obj20);
        java.lang.Object obj22 = queue0.remove();
        java.lang.Object obj23 = queue0.remove();
        Queue queue24 = new Queue();
        boolean b26 = queue24.add((java.lang.Object) 1.0f);
        Queue queue27 = new Queue();
        boolean b29 = queue27.add((java.lang.Object) "");
        java.lang.Object obj30 = queue27.remove();
        boolean b31 = queue24.add((java.lang.Object) queue27);
        java.lang.Object obj32 = queue24.element();
        Queue queue33 = new Queue();
        boolean b35 = queue33.add((java.lang.Object) 1.0f);
        java.lang.Object obj36 = queue33.element();
        java.lang.Object obj37 = queue33.element();
        java.lang.Object obj38 = queue33.remove();
        boolean b39 = queue24.add(obj38);
        boolean b40 = queue0.add(obj38);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1.0d + "'", obj14.equals(1.0d));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "" + "'", obj20.equals(""));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "" + "'", obj30.equals(""));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 1.0f + "'", obj32.equals(1.0f));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 1.0f + "'", obj36.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 1.0f + "'", obj37.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 1.0f + "'", obj38.equals(1.0f));
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        java.lang.Object obj5 = queue0.remove();
        boolean b7 = queue0.add((java.lang.Object) (byte) 10);
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) 1.0f);
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) "");
        java.lang.Object obj14 = queue11.remove();
        boolean b15 = queue8.add((java.lang.Object) queue11);
        java.lang.Object obj16 = queue8.element();
        java.lang.Object obj17 = queue8.element();
        Queue queue18 = new Queue();
        boolean b20 = queue18.add((java.lang.Object) "");
        java.lang.Object obj21 = queue18.element();
        java.lang.Object obj22 = queue18.element();
        boolean b24 = queue18.add((java.lang.Object) (byte) 0);
        java.lang.Object obj25 = queue18.element();
        boolean b26 = queue8.add((java.lang.Object) queue18);
        java.lang.Object obj27 = queue8.remove();
        boolean b28 = queue0.add((java.lang.Object) queue8);
        java.lang.Object obj29 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 1.0f + "'", obj16.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1.0f + "'", obj17.equals(1.0f));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "" + "'", obj21.equals(""));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1.0f + "'", obj27.equals(1.0f));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + (byte) 10 + "'", obj29.equals((byte) 10));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        boolean b6 = queue0.add((java.lang.Object) (short) -1);
        java.lang.Object obj7 = queue0.remove();
        java.lang.Object obj8 = queue0.element();
        Queue queue9 = new Queue();
        boolean b11 = queue9.add((java.lang.Object) 1.0f);
        Queue queue12 = new Queue();
        boolean b14 = queue12.add((java.lang.Object) "");
        java.lang.Object obj15 = queue12.remove();
        boolean b16 = queue9.add((java.lang.Object) queue12);
        java.lang.Object obj17 = queue9.element();
        java.lang.Object obj18 = queue9.element();
        Queue queue19 = new Queue();
        boolean b21 = queue19.add((java.lang.Object) "");
        java.lang.Object obj22 = queue19.element();
        java.lang.Object obj23 = queue19.element();
        boolean b25 = queue19.add((java.lang.Object) (byte) 0);
        java.lang.Object obj26 = queue19.element();
        boolean b27 = queue9.add((java.lang.Object) queue19);
        java.lang.Object obj28 = queue9.remove();
        Queue queue29 = new Queue();
        boolean b31 = queue29.add((java.lang.Object) 1.0f);
        Queue queue32 = new Queue();
        boolean b34 = queue32.add((java.lang.Object) "");
        java.lang.Object obj35 = queue32.remove();
        boolean b36 = queue29.add((java.lang.Object) queue32);
        java.lang.Object obj37 = queue29.element();
        java.lang.Object obj38 = queue29.element();
        Queue queue39 = new Queue();
        boolean b41 = queue39.add((java.lang.Object) "");
        java.lang.Object obj42 = queue39.element();
        java.lang.Object obj43 = queue39.element();
        boolean b45 = queue39.add((java.lang.Object) (byte) 0);
        java.lang.Object obj46 = queue39.element();
        boolean b47 = queue29.add((java.lang.Object) queue39);
        java.lang.Object obj48 = queue29.remove();
        boolean b49 = queue9.add(obj48);
        Queue queue50 = new Queue();
        boolean b52 = queue50.add((java.lang.Object) 1.0f);
        Queue queue53 = new Queue();
        boolean b55 = queue53.add((java.lang.Object) "");
        java.lang.Object obj56 = queue53.remove();
        boolean b57 = queue50.add((java.lang.Object) queue53);
        java.lang.Object obj58 = queue50.element();
        java.lang.Object obj59 = queue50.element();
        Queue queue60 = new Queue();
        boolean b62 = queue60.add((java.lang.Object) "");
        java.lang.Object obj63 = queue60.element();
        java.lang.Object obj64 = queue60.element();
        boolean b66 = queue60.add((java.lang.Object) (byte) 0);
        java.lang.Object obj67 = queue60.element();
        boolean b68 = queue50.add((java.lang.Object) queue60);
        boolean b69 = queue9.add((java.lang.Object) queue50);
        java.lang.Object obj70 = queue9.element();
        java.lang.Object obj71 = queue9.element();
        boolean b72 = queue0.add(obj71);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (-1.0d) + "'", obj8.equals((-1.0d)));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 1.0f + "'", obj17.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 1.0f + "'", obj18.equals(1.0f));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "" + "'", obj23.equals(""));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1.0f + "'", obj28.equals(1.0f));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + "" + "'", obj35.equals(""));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 1.0f + "'", obj37.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 1.0f + "'", obj38.equals(1.0f));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "" + "'", obj43.equals(""));
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + "" + "'", obj46.equals(""));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 1.0f + "'", obj48.equals(1.0f));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "" + "'", obj56.equals(""));
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 1.0f + "'", obj58.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 1.0f + "'", obj59.equals(1.0f));
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + "" + "'", obj63.equals(""));
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + "" + "'", obj64.equals(""));
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + "" + "'", obj67.equals(""));
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertTrue(b72 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        Queue queue5 = new Queue();
        boolean b7 = queue5.add((java.lang.Object) "");
        boolean b9 = queue5.add((java.lang.Object) 1.0d);
        boolean b11 = queue5.add((java.lang.Object) (byte) 100);
        boolean b12 = queue0.add((java.lang.Object) queue5);
        java.lang.Object obj13 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) (-1.0f));
        boolean b7 = queue0.add((java.lang.Object) 10);
        java.lang.Object obj8 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.remove();
        Queue queue5 = new Queue();
        boolean b7 = queue5.add((java.lang.Object) "");
        boolean b9 = queue5.add((java.lang.Object) (-1.0d));
        boolean b11 = queue5.add((java.lang.Object) (short) -1);
        java.lang.Object obj12 = queue5.element();
        java.lang.Object obj13 = queue5.remove();
        java.lang.Object obj14 = queue5.remove();
        java.lang.Object obj15 = queue5.element();
        boolean b16 = queue0.add((java.lang.Object) queue5);
        java.lang.Object obj17 = queue5.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + "" + "'", obj12.equals(""));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (-1.0d) + "'", obj14.equals((-1.0d)));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + (short) -1 + "'", obj15.equals((short) -1));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (short) -1 + "'", obj17.equals((short) -1));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        boolean b6 = queue0.add((java.lang.Object) (short) -1);
        java.lang.Object obj7 = queue0.element();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) "");
        boolean b12 = queue8.add((java.lang.Object) (-1.0d));
        boolean b14 = queue8.add((java.lang.Object) (short) -1);
        java.lang.Object obj15 = queue8.element();
        boolean b16 = queue0.add((java.lang.Object) queue8);
        java.lang.Object obj17 = queue8.remove();
        java.lang.Object obj18 = queue8.remove();
        Queue queue19 = new Queue();
        boolean b21 = queue19.add((java.lang.Object) "");
        java.lang.Object obj22 = queue19.element();
        boolean b24 = queue19.add((java.lang.Object) 1);
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) 1.0f);
        java.lang.Object obj28 = queue25.remove();
        boolean b30 = queue25.add((java.lang.Object) 1.0d);
        boolean b31 = queue19.add((java.lang.Object) queue25);
        boolean b33 = queue25.add((java.lang.Object) 10.0d);
        java.lang.Object obj34 = queue25.remove();
        java.lang.Object obj35 = queue25.remove();
        boolean b36 = queue8.add(obj35);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1.0d) + "'", obj18.equals((-1.0d)));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 1.0f + "'", obj28.equals(1.0f));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1.0d + "'", obj34.equals(1.0d));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 10.0d + "'", obj35.equals(10.0d));
        org.junit.Assert.assertTrue(b36 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        boolean b6 = queue0.add((java.lang.Object) (short) -1);
        java.lang.Object obj7 = queue0.element();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) "");
        boolean b12 = queue8.add((java.lang.Object) (-1.0d));
        boolean b14 = queue8.add((java.lang.Object) (short) -1);
        java.lang.Object obj15 = queue8.element();
        boolean b16 = queue0.add((java.lang.Object) queue8);
        java.lang.Object obj17 = queue8.remove();
        java.lang.Object obj18 = queue8.remove();
        java.lang.Object obj19 = queue8.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1.0d) + "'", obj18.equals((-1.0d)));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) -1 + "'", obj19.equals((short) -1));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) "hi!");
        java.lang.Object obj6 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        Queue queue5 = new Queue();
        boolean b6 = queue0.add((java.lang.Object) queue5);
        Queue queue7 = new Queue();
        boolean b8 = queue0.add((java.lang.Object) queue7);
        java.lang.Object obj9 = queue0.remove();
        Queue queue10 = new Queue();
        boolean b12 = queue10.add((java.lang.Object) "");
        java.lang.Object obj13 = queue10.element();
        boolean b15 = queue10.add((java.lang.Object) 1);
        Queue queue16 = new Queue();
        boolean b18 = queue16.add((java.lang.Object) 1.0f);
        java.lang.Object obj19 = queue16.remove();
        boolean b21 = queue16.add((java.lang.Object) 1.0d);
        boolean b22 = queue10.add((java.lang.Object) queue16);
        boolean b24 = queue16.add((java.lang.Object) 10.0d);
        java.lang.Object obj25 = queue16.remove();
        boolean b26 = queue0.add((java.lang.Object) queue16);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0f + "'", obj19.equals(1.0f));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1.0d + "'", obj25.equals(1.0d));
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        boolean b6 = queue0.add((java.lang.Object) (byte) 0);
        java.lang.Object obj7 = queue0.remove();
        java.lang.Object obj8 = queue0.element();
        Queue queue9 = new Queue();
        boolean b11 = queue9.add((java.lang.Object) 1.0f);
        Queue queue12 = new Queue();
        boolean b14 = queue12.add((java.lang.Object) "");
        java.lang.Object obj15 = queue12.remove();
        boolean b16 = queue9.add((java.lang.Object) queue12);
        boolean b18 = queue12.add((java.lang.Object) 10L);
        java.lang.Object obj19 = queue12.remove();
        boolean b20 = queue0.add(obj19);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (byte) 0 + "'", obj8.equals((byte) 0));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 10L + "'", obj19.equals(10L));
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) "");
        java.lang.Object obj6 = queue3.remove();
        boolean b7 = queue0.add((java.lang.Object) queue3);
        java.lang.Object obj8 = queue0.remove();
        java.lang.Object obj9 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        Queue queue3 = new Queue();
        boolean b5 = queue3.add((java.lang.Object) 1.0f);
        java.lang.Object obj6 = queue3.element();
        java.lang.Object obj7 = queue3.element();
        boolean b9 = queue3.add((java.lang.Object) 100.0f);
        java.lang.Object obj10 = queue3.remove();
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) 1.0f);
        Queue queue14 = new Queue();
        boolean b16 = queue14.add((java.lang.Object) "");
        java.lang.Object obj17 = queue14.remove();
        boolean b18 = queue11.add((java.lang.Object) queue14);
        boolean b19 = queue3.add((java.lang.Object) queue11);
        java.lang.Object obj20 = queue3.element();
        Queue queue21 = new Queue();
        boolean b23 = queue21.add((java.lang.Object) 1.0f);
        java.lang.Object obj24 = queue21.element();
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) 1.0f);
        Queue queue28 = new Queue();
        boolean b30 = queue28.add((java.lang.Object) "");
        java.lang.Object obj31 = queue28.remove();
        boolean b32 = queue25.add((java.lang.Object) queue28);
        boolean b33 = queue21.add((java.lang.Object) queue28);
        Queue queue34 = new Queue();
        boolean b36 = queue34.add((java.lang.Object) "");
        java.lang.Object obj37 = queue34.element();
        java.lang.Object obj38 = queue34.element();
        Queue queue39 = new Queue();
        boolean b40 = queue34.add((java.lang.Object) queue39);
        Queue queue41 = new Queue();
        boolean b42 = queue34.add((java.lang.Object) queue41);
        java.lang.Object obj43 = queue34.remove();
        boolean b44 = queue28.add(obj43);
        java.lang.Object obj45 = queue28.element();
        java.lang.Object obj46 = queue28.remove();
        boolean b47 = queue3.add(obj46);
        java.lang.Object obj48 = queue3.element();
        Queue queue49 = new Queue();
        boolean b51 = queue49.add((java.lang.Object) "");
        java.lang.Object obj52 = queue49.element();
        java.lang.Object obj53 = queue49.element();
        java.lang.Object obj54 = queue49.remove();
        Queue queue55 = new Queue();
        boolean b57 = queue55.add((java.lang.Object) "");
        java.lang.Object obj58 = queue55.element();
        java.lang.Object obj59 = queue55.element();
        Queue queue60 = new Queue();
        boolean b61 = queue55.add((java.lang.Object) queue60);
        java.lang.Object obj62 = queue55.element();
        Queue queue63 = new Queue();
        boolean b65 = queue63.add((java.lang.Object) 1.0f);
        boolean b66 = queue55.add((java.lang.Object) b65);
        boolean b67 = queue49.add((java.lang.Object) b66);
        boolean b69 = queue49.add((java.lang.Object) 100.0d);
        boolean b70 = queue3.add((java.lang.Object) queue49);
        boolean b71 = queue0.add((java.lang.Object) queue49);
        java.lang.Object obj72 = queue49.remove();
        java.lang.Object obj73 = null;
        boolean b74 = queue49.add(obj73);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 1.0f + "'", obj6.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 1.0f + "'", obj10.equals(1.0f));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 100.0f + "'", obj20.equals(100.0f));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 1.0f + "'", obj24.equals(1.0f));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "" + "'", obj31.equals(""));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "" + "'", obj38.equals(""));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "" + "'", obj43.equals(""));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "" + "'", obj45.equals(""));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + "" + "'", obj46.equals(""));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 100.0f + "'", obj48.equals(100.0f));
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + "" + "'", obj52.equals(""));
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + "" + "'", obj53.equals(""));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + "" + "'", obj54.equals(""));
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + "" + "'", obj58.equals(""));
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + "" + "'", obj59.equals(""));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + "" + "'", obj62.equals(""));
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + true + "'", obj72.equals(true));
        org.junit.Assert.assertTrue(b74 == true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj9 = queue6.remove();
        boolean b11 = queue6.add((java.lang.Object) 1.0d);
        boolean b12 = queue0.add((java.lang.Object) queue6);
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) "");
        boolean b17 = queue13.add((java.lang.Object) (-1.0d));
        Queue queue18 = new Queue();
        boolean b20 = queue18.add((java.lang.Object) 1.0f);
        java.lang.Object obj21 = queue18.element();
        boolean b22 = queue13.add((java.lang.Object) queue18);
        boolean b23 = queue6.add((java.lang.Object) b22);
        java.lang.Object obj24 = queue6.element();
        java.lang.Object obj25 = queue6.element();
        Queue queue26 = new Queue();
        boolean b28 = queue26.add((java.lang.Object) 1.0f);
        Queue queue29 = new Queue();
        boolean b31 = queue29.add((java.lang.Object) "");
        java.lang.Object obj32 = queue29.remove();
        boolean b33 = queue26.add((java.lang.Object) queue29);
        java.lang.Object obj34 = queue26.element();
        java.lang.Object obj35 = queue26.element();
        java.lang.Object obj36 = queue26.remove();
        java.lang.Object obj37 = queue26.element();
        boolean b38 = queue6.add((java.lang.Object) queue26);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1.0f + "'", obj21.equals(1.0f));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 1.0d + "'", obj24.equals(1.0d));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 1.0d + "'", obj25.equals(1.0d));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "" + "'", obj32.equals(""));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1.0f + "'", obj34.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1.0f + "'", obj35.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 1.0f + "'", obj36.equals(1.0f));
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        java.lang.Object obj5 = queue0.remove();
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        java.lang.Object obj9 = queue6.element();
        java.lang.Object obj10 = queue6.element();
        Queue queue11 = new Queue();
        boolean b12 = queue6.add((java.lang.Object) queue11);
        Queue queue13 = new Queue();
        boolean b14 = queue6.add((java.lang.Object) queue13);
        boolean b15 = queue0.add((java.lang.Object) b14);
        java.lang.Object obj16 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0f + "'", obj5.equals(1.0f));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + true + "'", obj16.equals(true));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        Queue queue5 = new Queue();
        boolean b6 = queue0.add((java.lang.Object) queue5);
        Queue queue7 = new Queue();
        boolean b8 = queue0.add((java.lang.Object) queue7);
        java.lang.Object obj9 = queue0.element();
        java.lang.Object obj10 = queue0.remove();
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) "");
        java.lang.Object obj14 = queue11.element();
        java.lang.Object obj15 = queue11.element();
        boolean b17 = queue11.add((java.lang.Object) (byte) 0);
        java.lang.Object obj18 = queue11.remove();
        java.lang.Object obj19 = queue11.element();
        Queue queue20 = new Queue();
        boolean b22 = queue20.add((java.lang.Object) 1.0f);
        java.lang.Object obj23 = queue20.element();
        Queue queue24 = new Queue();
        boolean b26 = queue24.add((java.lang.Object) 1.0f);
        Queue queue27 = new Queue();
        boolean b29 = queue27.add((java.lang.Object) "");
        java.lang.Object obj30 = queue27.remove();
        boolean b31 = queue24.add((java.lang.Object) queue27);
        boolean b32 = queue20.add((java.lang.Object) queue27);
        Queue queue33 = new Queue();
        boolean b35 = queue33.add((java.lang.Object) "");
        java.lang.Object obj36 = queue33.element();
        java.lang.Object obj37 = queue33.element();
        Queue queue38 = new Queue();
        boolean b39 = queue33.add((java.lang.Object) queue38);
        Queue queue40 = new Queue();
        boolean b41 = queue33.add((java.lang.Object) queue40);
        java.lang.Object obj42 = queue33.remove();
        boolean b43 = queue27.add(obj42);
        java.lang.Object obj44 = queue27.element();
        java.lang.Object obj45 = queue27.remove();
        boolean b46 = queue11.add((java.lang.Object) queue27);
        java.lang.Object obj47 = queue11.remove();
        boolean b48 = queue0.add((java.lang.Object) queue11);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "" + "'", obj18.equals(""));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (byte) 0 + "'", obj19.equals((byte) 0));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1.0f + "'", obj23.equals(1.0f));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "" + "'", obj30.equals(""));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + "" + "'", obj36.equals(""));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "" + "'", obj44.equals(""));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "" + "'", obj45.equals(""));
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (byte) 0 + "'", obj47.equals((byte) 0));
        org.junit.Assert.assertTrue(b48 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.remove();
        Queue queue4 = new Queue();
        boolean b6 = queue4.add((java.lang.Object) 1.0f);
        java.lang.Object obj7 = queue4.element();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) 1.0f);
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) "");
        java.lang.Object obj14 = queue11.remove();
        boolean b15 = queue8.add((java.lang.Object) queue11);
        boolean b16 = queue4.add((java.lang.Object) queue11);
        boolean b17 = queue0.add((java.lang.Object) b16);
        Queue queue18 = new Queue();
        boolean b20 = queue18.add((java.lang.Object) 1.0f);
        java.lang.Object obj21 = queue18.remove();
        boolean b23 = queue18.add((java.lang.Object) 1.0d);
        boolean b24 = queue0.add((java.lang.Object) b23);
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) "");
        boolean b29 = queue25.add((java.lang.Object) (-1.0d));
        java.lang.Object obj30 = queue25.remove();
        Queue queue31 = new Queue();
        boolean b33 = queue31.add((java.lang.Object) "");
        java.lang.Object obj34 = queue31.element();
        java.lang.Object obj35 = queue31.element();
        Queue queue36 = new Queue();
        boolean b37 = queue31.add((java.lang.Object) queue36);
        boolean b38 = queue25.add((java.lang.Object) queue36);
        boolean b39 = queue0.add((java.lang.Object) queue25);
        java.lang.Object obj40 = queue25.element();
        java.lang.Object obj41 = queue25.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1.0f + "'", obj21.equals(1.0f));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "" + "'", obj30.equals(""));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "" + "'", obj34.equals(""));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + "" + "'", obj35.equals(""));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + (-1.0d) + "'", obj40.equals((-1.0d)));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (-1.0d) + "'", obj41.equals((-1.0d)));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.remove();
        boolean b5 = queue0.add((java.lang.Object) 1.0d);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        boolean b10 = queue6.add((java.lang.Object) (-1.0d));
        boolean b12 = queue6.add((java.lang.Object) (short) -1);
        boolean b13 = queue0.add((java.lang.Object) queue6);
        Queue queue14 = new Queue();
        boolean b16 = queue14.add((java.lang.Object) "");
        java.lang.Object obj17 = queue14.element();
        boolean b19 = queue14.add((java.lang.Object) 1);
        java.lang.Object obj20 = queue14.element();
        Queue queue21 = new Queue();
        boolean b23 = queue21.add((java.lang.Object) "");
        java.lang.Object obj24 = queue21.element();
        java.lang.Object obj25 = queue21.element();
        boolean b27 = queue21.add((java.lang.Object) (byte) 0);
        java.lang.Object obj28 = queue21.remove();
        boolean b29 = queue14.add(obj28);
        java.lang.Object obj30 = queue14.remove();
        Queue queue31 = new Queue();
        boolean b33 = queue31.add((java.lang.Object) 1.0f);
        java.lang.Object obj34 = queue31.remove();
        boolean b36 = queue31.add((java.lang.Object) 1.0d);
        Queue queue37 = new Queue();
        boolean b39 = queue37.add((java.lang.Object) "");
        boolean b41 = queue37.add((java.lang.Object) (-1.0d));
        boolean b43 = queue37.add((java.lang.Object) (short) -1);
        boolean b44 = queue31.add((java.lang.Object) queue37);
        java.lang.Object obj45 = queue31.remove();
        boolean b46 = queue14.add((java.lang.Object) queue31);
        boolean b47 = queue0.add((java.lang.Object) queue31);
        java.lang.Object obj48 = queue0.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "" + "'", obj20.equals(""));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "" + "'", obj28.equals(""));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "" + "'", obj30.equals(""));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 1.0f + "'", obj34.equals(1.0f));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 1.0d + "'", obj45.equals(1.0d));
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 1.0d + "'", obj48.equals(1.0d));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        boolean b6 = queue0.add((java.lang.Object) (short) -1);
        java.lang.Object obj7 = queue0.element();
        java.lang.Object obj8 = queue0.element();
        java.lang.Object obj9 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "" + "'", obj8.equals(""));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.remove();
        boolean b5 = queue0.add((java.lang.Object) 1.0d);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        java.lang.Object obj9 = queue6.element();
        java.lang.Object obj10 = queue6.element();
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) 1.0f);
        Queue queue14 = new Queue();
        boolean b16 = queue14.add((java.lang.Object) "");
        java.lang.Object obj17 = queue14.remove();
        boolean b18 = queue11.add((java.lang.Object) queue14);
        java.lang.Object obj19 = queue11.element();
        java.lang.Object obj20 = queue11.element();
        java.lang.Object obj21 = queue11.remove();
        java.lang.Object obj22 = queue11.element();
        boolean b23 = queue6.add(obj22);
        boolean b24 = queue0.add((java.lang.Object) b23);
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) "");
        java.lang.Object obj28 = queue25.element();
        java.lang.Object obj29 = queue25.element();
        boolean b31 = queue25.add((java.lang.Object) (byte) 0);
        boolean b33 = queue25.add((java.lang.Object) 100L);
        boolean b34 = queue0.add((java.lang.Object) 100L);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0f + "'", obj19.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 1.0f + "'", obj20.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1.0f + "'", obj21.equals(1.0f));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "" + "'", obj28.equals(""));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b34 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.remove();
        boolean b5 = queue0.add((java.lang.Object) 1.0d);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        boolean b10 = queue6.add((java.lang.Object) (-1.0d));
        boolean b12 = queue6.add((java.lang.Object) (short) -1);
        boolean b13 = queue0.add((java.lang.Object) queue6);
        java.lang.Object obj14 = queue0.remove();
        java.lang.Object obj15 = queue0.element();
        java.lang.Object obj16 = queue0.remove();
        Queue queue17 = new Queue();
        boolean b19 = queue17.add((java.lang.Object) "");
        boolean b21 = queue17.add((java.lang.Object) (-1.0d));
        boolean b23 = queue17.add((java.lang.Object) (short) -1);
        java.lang.Object obj24 = queue17.remove();
        java.lang.Object obj25 = queue17.element();
        boolean b26 = queue0.add((java.lang.Object) queue17);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 1.0d + "'", obj14.equals(1.0d));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "" + "'", obj24.equals(""));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (-1.0d) + "'", obj25.equals((-1.0d)));
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        Queue queue5 = new Queue();
        boolean b7 = queue5.add((java.lang.Object) 1.0f);
        java.lang.Object obj8 = queue5.element();
        boolean b9 = queue0.add((java.lang.Object) queue5);
        Queue queue10 = new Queue();
        boolean b12 = queue10.add((java.lang.Object) 1.0f);
        java.lang.Object obj13 = queue10.element();
        boolean b15 = queue10.add((java.lang.Object) (-1.0f));
        boolean b17 = queue10.add((java.lang.Object) 10);
        boolean b18 = queue0.add((java.lang.Object) queue10);
        java.lang.Object obj19 = queue0.element();
        Queue queue20 = new Queue();
        boolean b22 = queue20.add((java.lang.Object) 1.0f);
        java.lang.Object obj23 = queue20.element();
        java.lang.Object obj24 = queue20.element();
        boolean b26 = queue20.add((java.lang.Object) 100.0f);
        java.lang.Object obj27 = queue20.remove();
        Queue queue28 = new Queue();
        boolean b30 = queue28.add((java.lang.Object) 1.0f);
        Queue queue31 = new Queue();
        boolean b33 = queue31.add((java.lang.Object) "");
        java.lang.Object obj34 = queue31.remove();
        boolean b35 = queue28.add((java.lang.Object) queue31);
        boolean b36 = queue20.add((java.lang.Object) queue28);
        java.lang.Object obj37 = queue20.element();
        Queue queue38 = new Queue();
        boolean b40 = queue38.add((java.lang.Object) 1.0f);
        java.lang.Object obj41 = queue38.element();
        Queue queue42 = new Queue();
        boolean b44 = queue42.add((java.lang.Object) 1.0f);
        Queue queue45 = new Queue();
        boolean b47 = queue45.add((java.lang.Object) "");
        java.lang.Object obj48 = queue45.remove();
        boolean b49 = queue42.add((java.lang.Object) queue45);
        boolean b50 = queue38.add((java.lang.Object) queue45);
        Queue queue51 = new Queue();
        boolean b53 = queue51.add((java.lang.Object) "");
        java.lang.Object obj54 = queue51.element();
        java.lang.Object obj55 = queue51.element();
        Queue queue56 = new Queue();
        boolean b57 = queue51.add((java.lang.Object) queue56);
        Queue queue58 = new Queue();
        boolean b59 = queue51.add((java.lang.Object) queue58);
        java.lang.Object obj60 = queue51.remove();
        boolean b61 = queue45.add(obj60);
        java.lang.Object obj62 = queue45.element();
        java.lang.Object obj63 = queue45.remove();
        boolean b64 = queue20.add(obj63);
        java.lang.Object obj65 = queue20.element();
        Queue queue66 = new Queue();
        boolean b68 = queue66.add((java.lang.Object) 1.0f);
        java.lang.Object obj69 = queue66.remove();
        boolean b71 = queue66.add((java.lang.Object) 1.0d);
        boolean b72 = queue20.add((java.lang.Object) 1.0d);
        java.lang.Object obj73 = queue20.element();
        boolean b74 = queue0.add((java.lang.Object) queue20);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 1.0f + "'", obj8.equals(1.0f));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 1.0f + "'", obj13.equals(1.0f));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "" + "'", obj19.equals(""));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 1.0f + "'", obj23.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 1.0f + "'", obj24.equals(1.0f));
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 1.0f + "'", obj27.equals(1.0f));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "" + "'", obj34.equals(""));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 100.0f + "'", obj37.equals(100.0f));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1.0f + "'", obj41.equals(1.0f));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + "" + "'", obj48.equals(""));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + "" + "'", obj54.equals(""));
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + "" + "'", obj55.equals(""));
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + "" + "'", obj60.equals(""));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + "" + "'", obj62.equals(""));
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + "" + "'", obj63.equals(""));
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 100.0f + "'", obj65.equals(100.0f));
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 1.0f + "'", obj69.equals(1.0f));
        org.junit.Assert.assertTrue(b71 == true);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 100.0f + "'", obj73.equals(100.0f));
        org.junit.Assert.assertTrue(b74 == true);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj9 = queue6.remove();
        boolean b11 = queue6.add((java.lang.Object) 1.0d);
        boolean b12 = queue0.add((java.lang.Object) queue6);
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) "");
        java.lang.Object obj16 = queue13.element();
        java.lang.Object obj17 = queue13.remove();
        boolean b18 = queue6.add((java.lang.Object) queue13);
        Queue queue19 = new Queue();
        boolean b21 = queue19.add((java.lang.Object) "");
        boolean b23 = queue19.add((java.lang.Object) (-1.0d));
        boolean b25 = queue19.add((java.lang.Object) (short) -1);
        java.lang.Object obj26 = queue19.remove();
        boolean b28 = queue19.add((java.lang.Object) 1);
        Queue queue29 = new Queue();
        boolean b31 = queue29.add((java.lang.Object) "");
        java.lang.Object obj32 = queue29.element();
        java.lang.Object obj33 = queue29.element();
        Queue queue34 = new Queue();
        boolean b35 = queue29.add((java.lang.Object) queue34);
        Queue queue36 = new Queue();
        boolean b37 = queue29.add((java.lang.Object) queue36);
        java.lang.Object obj38 = queue29.remove();
        boolean b40 = queue29.add((java.lang.Object) (-1));
        Queue queue41 = new Queue();
        boolean b43 = queue41.add((java.lang.Object) "");
        java.lang.Object obj44 = queue41.element();
        java.lang.Object obj45 = queue41.element();
        boolean b47 = queue41.add((java.lang.Object) (byte) 0);
        boolean b49 = queue41.add((java.lang.Object) 100L);
        boolean b50 = queue29.add((java.lang.Object) queue41);
        java.lang.Object obj51 = queue41.remove();
        boolean b52 = queue19.add((java.lang.Object) queue41);
        java.lang.Object obj53 = queue19.element();
        boolean b54 = queue13.add((java.lang.Object) queue19);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "" + "'", obj32.equals(""));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "" + "'", obj33.equals(""));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "" + "'", obj38.equals(""));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "" + "'", obj44.equals(""));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "" + "'", obj45.equals(""));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + "" + "'", obj51.equals(""));
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + (-1.0d) + "'", obj53.equals((-1.0d)));
        org.junit.Assert.assertTrue(b54 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        boolean b6 = queue0.add((java.lang.Object) (byte) 0);
        Queue queue7 = new Queue();
        boolean b9 = queue7.add((java.lang.Object) "");
        java.lang.Object obj10 = queue7.element();
        java.lang.Object obj11 = queue7.remove();
        Queue queue12 = new Queue();
        boolean b14 = queue12.add((java.lang.Object) "");
        boolean b16 = queue12.add((java.lang.Object) (-1.0d));
        boolean b18 = queue12.add((java.lang.Object) (short) -1);
        java.lang.Object obj19 = queue12.element();
        java.lang.Object obj20 = queue12.remove();
        java.lang.Object obj21 = queue12.remove();
        java.lang.Object obj22 = queue12.element();
        boolean b23 = queue7.add((java.lang.Object) queue12);
        boolean b24 = queue0.add((java.lang.Object) queue12);
        java.lang.Object obj25 = queue0.remove();
        Queue queue26 = new Queue();
        boolean b28 = queue26.add((java.lang.Object) "");
        java.lang.Object obj29 = queue26.element();
        java.lang.Object obj30 = queue26.element();
        boolean b32 = queue26.add((java.lang.Object) (byte) 0);
        Queue queue33 = new Queue();
        boolean b35 = queue33.add((java.lang.Object) "");
        java.lang.Object obj36 = queue33.element();
        java.lang.Object obj37 = queue33.remove();
        Queue queue38 = new Queue();
        boolean b40 = queue38.add((java.lang.Object) "");
        boolean b42 = queue38.add((java.lang.Object) (-1.0d));
        boolean b44 = queue38.add((java.lang.Object) (short) -1);
        java.lang.Object obj45 = queue38.element();
        java.lang.Object obj46 = queue38.remove();
        java.lang.Object obj47 = queue38.remove();
        java.lang.Object obj48 = queue38.element();
        boolean b49 = queue33.add((java.lang.Object) queue38);
        boolean b50 = queue26.add((java.lang.Object) queue38);
        Queue queue51 = new Queue();
        boolean b53 = queue51.add((java.lang.Object) 1.0f);
        java.lang.Object obj54 = queue51.element();
        java.lang.Object obj55 = queue51.element();
        java.lang.Object obj56 = queue51.remove();
        Queue queue57 = new Queue();
        boolean b59 = queue57.add((java.lang.Object) "");
        java.lang.Object obj60 = queue57.element();
        java.lang.Object obj61 = queue57.element();
        Queue queue62 = new Queue();
        boolean b63 = queue57.add((java.lang.Object) queue62);
        Queue queue64 = new Queue();
        boolean b65 = queue57.add((java.lang.Object) queue64);
        boolean b66 = queue51.add((java.lang.Object) b65);
        Queue queue67 = new Queue();
        boolean b69 = queue67.add((java.lang.Object) 1.0f);
        java.lang.Object obj70 = queue67.element();
        java.lang.Object obj71 = queue67.element();
        java.lang.Object obj72 = queue67.remove();
        Queue queue73 = new Queue();
        boolean b75 = queue73.add((java.lang.Object) "");
        java.lang.Object obj76 = queue73.element();
        java.lang.Object obj77 = queue73.element();
        Queue queue78 = new Queue();
        boolean b79 = queue73.add((java.lang.Object) queue78);
        Queue queue80 = new Queue();
        boolean b81 = queue73.add((java.lang.Object) queue80);
        boolean b82 = queue67.add((java.lang.Object) b81);
        java.lang.Object obj83 = queue67.element();
        java.lang.Object obj84 = queue67.element();
        java.lang.Object obj85 = queue67.remove();
        Queue queue86 = new Queue();
        boolean b88 = queue86.add((java.lang.Object) "");
        java.lang.Object obj89 = queue86.element();
        java.lang.Object obj90 = queue86.element();
        Queue queue91 = new Queue();
        boolean b92 = queue86.add((java.lang.Object) queue91);
        java.lang.Object obj93 = queue86.element();
        java.lang.Object obj94 = queue86.element();
        java.lang.Object obj95 = queue86.remove();
        boolean b96 = queue67.add((java.lang.Object) queue86);
        boolean b97 = queue51.add((java.lang.Object) queue67);
        boolean b98 = queue38.add((java.lang.Object) queue51);
        boolean b99 = queue0.add((java.lang.Object) queue51);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "" + "'", obj4.equals(""));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "" + "'", obj11.equals(""));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "" + "'", obj19.equals(""));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "" + "'", obj20.equals(""));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (-1.0d) + "'", obj21.equals((-1.0d)));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short) -1 + "'", obj22.equals((short) -1));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "" + "'", obj29.equals(""));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "" + "'", obj30.equals(""));
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + "" + "'", obj36.equals(""));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "" + "'", obj37.equals(""));
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "" + "'", obj45.equals(""));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + "" + "'", obj46.equals(""));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (-1.0d) + "'", obj47.equals((-1.0d)));
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + (short) -1 + "'", obj48.equals((short) -1));
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 1.0f + "'", obj54.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 1.0f + "'", obj55.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 1.0f + "'", obj56.equals(1.0f));
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + "" + "'", obj60.equals(""));
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + "" + "'", obj61.equals(""));
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 1.0f + "'", obj70.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 1.0f + "'", obj71.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 1.0f + "'", obj72.equals(1.0f));
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + "" + "'", obj76.equals(""));
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + "" + "'", obj77.equals(""));
        org.junit.Assert.assertTrue(b79 == true);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue(b82 == true);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + true + "'", obj83.equals(true));
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + true + "'", obj84.equals(true));
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + true + "'", obj85.equals(true));
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + "" + "'", obj89.equals(""));
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + "" + "'", obj90.equals(""));
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertTrue("'" + obj93 + "' != '" + "" + "'", obj93.equals(""));
        org.junit.Assert.assertTrue("'" + obj94 + "' != '" + "" + "'", obj94.equals(""));
        org.junit.Assert.assertTrue("'" + obj95 + "' != '" + "" + "'", obj95.equals(""));
        org.junit.Assert.assertTrue(b96 == true);
        org.junit.Assert.assertTrue(b97 == true);
        org.junit.Assert.assertTrue(b98 == true);
        org.junit.Assert.assertTrue(b99 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj9 = queue6.remove();
        boolean b11 = queue6.add((java.lang.Object) 1.0d);
        boolean b12 = queue0.add((java.lang.Object) queue6);
        Queue queue13 = new Queue();
        boolean b15 = queue13.add((java.lang.Object) "");
        java.lang.Object obj16 = queue13.element();
        java.lang.Object obj17 = queue13.remove();
        boolean b18 = queue6.add((java.lang.Object) queue13);
        Queue queue19 = new Queue();
        boolean b21 = queue19.add((java.lang.Object) "");
        java.lang.Object obj22 = queue19.element();
        boolean b24 = queue19.add((java.lang.Object) 1);
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) "");
        boolean b29 = queue25.add((java.lang.Object) (-1.0d));
        boolean b31 = queue25.add((java.lang.Object) (short) -1);
        java.lang.Object obj32 = queue25.remove();
        boolean b34 = queue25.add((java.lang.Object) 1);
        boolean b35 = queue19.add((java.lang.Object) b34);
        boolean b36 = queue6.add((java.lang.Object) queue19);
        boolean b38 = queue6.add((java.lang.Object) 100.0f);
        java.lang.Object obj39 = queue6.remove();
        Queue queue40 = new Queue();
        boolean b42 = queue40.add((java.lang.Object) "");
        java.lang.Object obj43 = queue40.element();
        java.lang.Object obj44 = queue40.element();
        Queue queue45 = new Queue();
        boolean b46 = queue40.add((java.lang.Object) queue45);
        Queue queue47 = new Queue();
        boolean b48 = queue40.add((java.lang.Object) queue47);
        java.lang.Object obj49 = queue40.remove();
        boolean b51 = queue40.add((java.lang.Object) (-1));
        java.lang.Object obj52 = null;
        boolean b53 = queue40.add(obj52);
        java.lang.Object obj54 = queue40.remove();
        boolean b55 = queue6.add(obj54);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "" + "'", obj22.equals(""));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "" + "'", obj32.equals(""));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1.0d + "'", obj39.equals(1.0d));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "" + "'", obj43.equals(""));
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "" + "'", obj44.equals(""));
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + "" + "'", obj49.equals(""));
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue(b55 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        java.lang.Object obj6 = queue0.element();
        Queue queue7 = new Queue();
        boolean b9 = queue7.add((java.lang.Object) "");
        java.lang.Object obj10 = queue7.element();
        java.lang.Object obj11 = queue7.element();
        boolean b13 = queue7.add((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = queue7.remove();
        boolean b15 = queue0.add(obj14);
        java.lang.Object obj16 = queue0.remove();
        Queue queue17 = new Queue();
        boolean b19 = queue17.add((java.lang.Object) "");
        java.lang.Object obj20 = queue17.element();
        boolean b22 = queue17.add((java.lang.Object) 1);
        Queue queue23 = new Queue();
        boolean b25 = queue23.add((java.lang.Object) 1.0f);
        java.lang.Object obj26 = queue23.remove();
        boolean b28 = queue23.add((java.lang.Object) 1.0d);
        boolean b29 = queue17.add((java.lang.Object) queue23);
        Queue queue30 = new Queue();
        boolean b32 = queue30.add((java.lang.Object) "");
        boolean b34 = queue30.add((java.lang.Object) (-1.0d));
        Queue queue35 = new Queue();
        boolean b37 = queue35.add((java.lang.Object) 1.0f);
        java.lang.Object obj38 = queue35.element();
        boolean b39 = queue30.add((java.lang.Object) queue35);
        boolean b40 = queue23.add((java.lang.Object) b39);
        java.lang.Object obj41 = queue23.element();
        java.lang.Object obj42 = queue23.element();
        boolean b43 = queue0.add(obj42);
        java.lang.Object obj44 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "" + "'", obj11.equals(""));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "" + "'", obj20.equals(""));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 1.0f + "'", obj26.equals(1.0f));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 1.0f + "'", obj38.equals(1.0f));
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 1.0d + "'", obj41.equals(1.0d));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 1.0d + "'", obj42.equals(1.0d));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1 + "'", obj44.equals(1));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        java.lang.Object obj6 = queue0.element();
        java.lang.Object obj7 = queue0.remove();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) "");
        java.lang.Object obj11 = queue8.element();
        boolean b13 = queue8.add((java.lang.Object) 1);
        java.lang.Object obj14 = queue8.element();
        Queue queue15 = new Queue();
        boolean b17 = queue15.add((java.lang.Object) "");
        java.lang.Object obj18 = queue15.element();
        java.lang.Object obj19 = queue15.element();
        boolean b21 = queue15.add((java.lang.Object) (byte) 0);
        boolean b22 = queue8.add((java.lang.Object) (byte) 0);
        boolean b23 = queue0.add((java.lang.Object) queue8);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "" + "'", obj11.equals(""));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "" + "'", obj18.equals(""));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "" + "'", obj19.equals(""));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        boolean b6 = queue0.add((java.lang.Object) (short) -1);
        java.lang.Object obj7 = queue0.element();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) "");
        boolean b12 = queue8.add((java.lang.Object) (-1.0d));
        boolean b14 = queue8.add((java.lang.Object) (short) -1);
        java.lang.Object obj15 = queue8.element();
        boolean b16 = queue0.add((java.lang.Object) queue8);
        java.lang.Object obj17 = queue8.remove();
        java.lang.Object obj18 = queue8.remove();
        java.lang.Object obj19 = queue8.element();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "" + "'", obj15.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + (-1.0d) + "'", obj18.equals((-1.0d)));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short) -1 + "'", obj19.equals((short) -1));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) 1.0f);
        java.lang.Object obj9 = queue6.remove();
        boolean b10 = queue0.add((java.lang.Object) queue6);
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) "");
        boolean b15 = queue11.add((java.lang.Object) (-1.0d));
        java.lang.Object obj16 = queue11.remove();
        Queue queue17 = new Queue();
        boolean b19 = queue17.add((java.lang.Object) "");
        java.lang.Object obj20 = queue17.element();
        java.lang.Object obj21 = queue17.element();
        Queue queue22 = new Queue();
        boolean b23 = queue17.add((java.lang.Object) queue22);
        boolean b24 = queue11.add((java.lang.Object) queue22);
        boolean b25 = queue0.add((java.lang.Object) queue22);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0f + "'", obj9.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "" + "'", obj20.equals(""));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + "" + "'", obj21.equals(""));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        boolean b4 = queue0.add((java.lang.Object) (-1.0d));
        boolean b6 = queue0.add((java.lang.Object) (short) -1);
        java.lang.Object obj7 = queue0.remove();
        boolean b9 = queue0.add((java.lang.Object) 1);
        Queue queue10 = new Queue();
        boolean b12 = queue10.add((java.lang.Object) "");
        java.lang.Object obj13 = queue10.element();
        java.lang.Object obj14 = queue10.element();
        Queue queue15 = new Queue();
        boolean b16 = queue10.add((java.lang.Object) queue15);
        Queue queue17 = new Queue();
        boolean b18 = queue10.add((java.lang.Object) queue17);
        java.lang.Object obj19 = queue10.remove();
        boolean b21 = queue10.add((java.lang.Object) (-1));
        Queue queue22 = new Queue();
        boolean b24 = queue22.add((java.lang.Object) "");
        java.lang.Object obj25 = queue22.element();
        java.lang.Object obj26 = queue22.element();
        boolean b28 = queue22.add((java.lang.Object) (byte) 0);
        boolean b30 = queue22.add((java.lang.Object) 100L);
        boolean b31 = queue10.add((java.lang.Object) queue22);
        java.lang.Object obj32 = queue22.remove();
        boolean b33 = queue0.add((java.lang.Object) queue22);
        java.lang.Object obj34 = queue0.element();
        Queue queue35 = new Queue();
        boolean b37 = queue35.add((java.lang.Object) "");
        boolean b39 = queue35.add((java.lang.Object) (-1.0d));
        boolean b41 = queue35.add((java.lang.Object) (short) -1);
        java.lang.Object obj42 = queue35.remove();
        boolean b44 = queue35.add((java.lang.Object) 1);
        Queue queue45 = new Queue();
        boolean b47 = queue45.add((java.lang.Object) "");
        java.lang.Object obj48 = queue45.element();
        java.lang.Object obj49 = queue45.element();
        Queue queue50 = new Queue();
        boolean b51 = queue45.add((java.lang.Object) queue50);
        Queue queue52 = new Queue();
        boolean b53 = queue45.add((java.lang.Object) queue52);
        java.lang.Object obj54 = queue45.remove();
        boolean b56 = queue45.add((java.lang.Object) (-1));
        Queue queue57 = new Queue();
        boolean b59 = queue57.add((java.lang.Object) "");
        java.lang.Object obj60 = queue57.element();
        java.lang.Object obj61 = queue57.element();
        boolean b63 = queue57.add((java.lang.Object) (byte) 0);
        boolean b65 = queue57.add((java.lang.Object) 100L);
        boolean b66 = queue45.add((java.lang.Object) queue57);
        java.lang.Object obj67 = queue57.remove();
        boolean b68 = queue35.add((java.lang.Object) queue57);
        boolean b69 = queue0.add((java.lang.Object) queue35);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "" + "'", obj7.equals(""));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "" + "'", obj13.equals(""));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "" + "'", obj19.equals(""));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + "" + "'", obj25.equals(""));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "" + "'", obj26.equals(""));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "" + "'", obj32.equals(""));
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (-1.0d) + "'", obj34.equals((-1.0d)));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "" + "'", obj42.equals(""));
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + "" + "'", obj48.equals(""));
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + "" + "'", obj49.equals(""));
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + "" + "'", obj54.equals(""));
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + "" + "'", obj60.equals(""));
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + "" + "'", obj61.equals(""));
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + "" + "'", obj67.equals(""));
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b69 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.remove();
        boolean b5 = queue0.add((java.lang.Object) 1.0d);
        Queue queue6 = new Queue();
        boolean b8 = queue6.add((java.lang.Object) "");
        java.lang.Object obj9 = queue6.element();
        java.lang.Object obj10 = queue6.element();
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) 1.0f);
        Queue queue14 = new Queue();
        boolean b16 = queue14.add((java.lang.Object) "");
        java.lang.Object obj17 = queue14.remove();
        boolean b18 = queue11.add((java.lang.Object) queue14);
        java.lang.Object obj19 = queue11.element();
        java.lang.Object obj20 = queue11.element();
        java.lang.Object obj21 = queue11.remove();
        java.lang.Object obj22 = queue11.element();
        boolean b23 = queue6.add(obj22);
        boolean b24 = queue0.add((java.lang.Object) b23);
        Queue queue25 = new Queue();
        boolean b27 = queue25.add((java.lang.Object) "");
        boolean b29 = queue25.add((java.lang.Object) (-1.0d));
        Queue queue30 = new Queue();
        boolean b32 = queue30.add((java.lang.Object) 1.0f);
        java.lang.Object obj33 = queue30.element();
        boolean b34 = queue25.add((java.lang.Object) queue30);
        java.lang.Object obj35 = queue30.element();
        boolean b37 = queue30.add((java.lang.Object) "hi!");
        boolean b38 = queue0.add((java.lang.Object) queue30);
        java.lang.Object obj39 = queue30.remove();
        Queue queue40 = new Queue();
        boolean b42 = queue40.add((java.lang.Object) 1.0f);
        java.lang.Object obj43 = queue40.element();
        java.lang.Object obj44 = queue40.element();
        boolean b46 = queue40.add((java.lang.Object) 100.0f);
        boolean b48 = queue40.add((java.lang.Object) 10.0d);
        java.lang.Object obj49 = queue40.element();
        java.lang.Object obj50 = queue40.element();
        Queue queue51 = new Queue();
        boolean b53 = queue51.add((java.lang.Object) "");
        java.lang.Object obj54 = queue51.element();
        java.lang.Object obj55 = queue51.element();
        Queue queue56 = new Queue();
        boolean b58 = queue56.add((java.lang.Object) 1.0f);
        Queue queue59 = new Queue();
        boolean b61 = queue59.add((java.lang.Object) "");
        java.lang.Object obj62 = queue59.remove();
        boolean b63 = queue56.add((java.lang.Object) queue59);
        java.lang.Object obj64 = queue56.element();
        java.lang.Object obj65 = queue56.element();
        java.lang.Object obj66 = queue56.remove();
        java.lang.Object obj67 = queue56.element();
        boolean b68 = queue51.add(obj67);
        boolean b69 = queue40.add((java.lang.Object) queue51);
        boolean b70 = queue30.add((java.lang.Object) b69);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + "" + "'", obj9.equals(""));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "" + "'", obj17.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0f + "'", obj19.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 1.0f + "'", obj20.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 1.0f + "'", obj21.equals(1.0f));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 1.0f + "'", obj33.equals(1.0f));
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 1.0f + "'", obj35.equals(1.0f));
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 1.0f + "'", obj39.equals(1.0f));
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 1.0f + "'", obj43.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 1.0f + "'", obj44.equals(1.0f));
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 1.0f + "'", obj49.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 1.0f + "'", obj50.equals(1.0f));
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + "" + "'", obj54.equals(""));
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + "" + "'", obj55.equals(""));
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + "" + "'", obj62.equals(""));
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 1.0f + "'", obj64.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 1.0f + "'", obj65.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 1.0f + "'", obj66.equals(1.0f));
        org.junit.Assert.assertNotNull(obj67);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue(b70 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) "");
        java.lang.Object obj3 = queue0.element();
        boolean b5 = queue0.add((java.lang.Object) 1);
        java.lang.Object obj6 = queue0.element();
        Queue queue7 = new Queue();
        boolean b9 = queue7.add((java.lang.Object) "");
        java.lang.Object obj10 = queue7.element();
        java.lang.Object obj11 = queue7.element();
        boolean b13 = queue7.add((java.lang.Object) (byte) 0);
        java.lang.Object obj14 = queue7.remove();
        boolean b15 = queue0.add(obj14);
        java.lang.Object obj16 = queue0.remove();
        boolean b18 = queue0.add((java.lang.Object) 0);
        java.lang.Object obj19 = null;
        boolean b20 = queue0.add(obj19);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "" + "'", obj3.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "" + "'", obj6.equals(""));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + "" + "'", obj10.equals(""));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + "" + "'", obj11.equals(""));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "" + "'", obj16.equals(""));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Queue queue0 = new Queue();
        boolean b2 = queue0.add((java.lang.Object) 1.0f);
        java.lang.Object obj3 = queue0.element();
        java.lang.Object obj4 = queue0.element();
        boolean b6 = queue0.add((java.lang.Object) 100.0f);
        java.lang.Object obj7 = queue0.remove();
        Queue queue8 = new Queue();
        boolean b10 = queue8.add((java.lang.Object) 1.0f);
        Queue queue11 = new Queue();
        boolean b13 = queue11.add((java.lang.Object) "");
        java.lang.Object obj14 = queue11.remove();
        boolean b15 = queue8.add((java.lang.Object) queue11);
        boolean b16 = queue0.add((java.lang.Object) queue8);
        java.lang.Object obj17 = queue0.remove();
        java.lang.Object obj18 = queue0.remove();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f + "'", obj3.equals(1.0f));
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0f + "'", obj4.equals(1.0f));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0f + "'", obj7.equals(1.0f));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + "" + "'", obj14.equals(""));
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100.0f + "'", obj17.equals(100.0f));
        org.junit.Assert.assertNotNull(obj18);
    }
}

