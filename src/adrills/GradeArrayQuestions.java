/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adrills;

/**
 *
 * @author jgillham
 */
public class GradeArrayQuestions {
    static public void main( String[] args ) {
        try {
            test_getElement101();
            System.out.println( "test_getElement101 successful!" );
        }
        catch ( Exception e ) {
            e.printStackTrace();
        }
        try {
            test_getElement102();
            System.out.println( "test_getElement102 successful!" );
        }
        catch ( Exception e ) {
            e.printStackTrace();
        }
        try {
            test_getElement103();
            System.out.println( "test_getElement103 successful!" );
        }
        catch ( Exception e ) {
            e.printStackTrace();
        }
        
        try {
            test_changeArray101();
            System.out.println( "test_changeArray101 successful!" );
        }
        catch ( Exception e ) {
            e.printStackTrace();
        }
        try {
            test_changeArray102();
            System.out.println( "test_changeArray102 successful!" );
        }
        catch ( Exception e ) {
            e.printStackTrace();
        }
    }
        
    static public void test_getElement101() throws Exception {
        int[] input = { 1, 6, 13, 8, 20 };
        if( 1 != ArrayQuestions.getElement101( input, 0 ) )
            throw new Exception( "Test failed." );
        if( 6 != ArrayQuestions.getElement101( input, 1 ) )
            throw new Exception( "Test failed." );
        if( 13 != ArrayQuestions.getElement101( input, 2 ) )
            throw new Exception( "Test failed." );
        if( 20 != ArrayQuestions.getElement101( input, 4 ) )
            throw new Exception( "Test failed." );
        try {
            ArrayQuestions.getElement102( input, -1 );
            throw new Exception( "Test failed: Should throw an exception." );
        }
        catch( Exception e ) {
            // Success.
        }
        try {
            ArrayQuestions.getElement102( input, 5 );
            throw new Exception( "Test failed: Should throw an exception." );
        }
        catch( Exception e ) {
            // Success.
        }
    }
    static public void test_getElement102() throws Exception {
        int[] input = { 1, 6, 13, 8, 20 };
        if( 1 != ArrayQuestions.getElement102( input, -1 ) )
            throw new Exception( "Test failed." );
        if( 6 != ArrayQuestions.getElement102( input, 0 ) )
            throw new Exception( "Test failed." );
        if( 13 != ArrayQuestions.getElement102( input, 1 ) )
            throw new Exception( "Test failed." );
        if( 8 != ArrayQuestions.getElement102( input, 2 ) )
            throw new Exception( "Test failed." );
        if( 20 != ArrayQuestions.getElement102( input, 3 ) )
            throw new Exception( "Test failed." );
        try {
            ArrayQuestions.getElement102( input, 4 );
            throw new Exception( "Test failed: Should throw an exception." );
        }
        catch( Exception e ) {
            // Success.
        }
    }
    static public void test_getElement103() throws Exception {
        int[] input = { 1, 6, 13, 8, 20 };
        
        if( 1 != ArrayQuestions.getElement103( input, 1 ) )
            throw new Exception( "Test failed." );
        if( 6 != ArrayQuestions.getElement103( input, 2 ) )
            throw new Exception( "Test failed." );
        if( 13 != ArrayQuestions.getElement103( input, 3 ) )
            throw new Exception( "Test failed." );
        if( 8 != ArrayQuestions.getElement103( input, 4 ) )
            throw new Exception( "Test failed." );
        if( 20 != ArrayQuestions.getElement103( input, 5 ) )
            throw new Exception( "Test failed." );
        try {
            ArrayQuestions.getElement103( input, -1 );
            throw new Exception( "Test failed: Should throw an exception." );
        }
        catch( Exception e ) {
            // Success.
        }
        try {
            ArrayQuestions.getElement103( input, 6 );
            throw new Exception( "Test failed: Should throw an exception." );
        }
        catch( Exception e ) {
            // Success.
        }
    }
    
    static public void test_changeArray101() throws Exception {
        {
            int[] input = { 1, 2 };
            int[] expected = { 2 };
            int[] actual = ArrayQuestions.changeArray101( input );
            
            if ( expected.length != actual.length ) {
                throw new Exception( "Test failed: array have wrong length." );
            }
            for ( int i = 0; i < actual.length; ++i ) {
                if ( expected[i] != actual[i] ) {
                    throw new Exception( "Test failed: the " + i + 
                            " element should be " + actual[i] + " but was " + 
                                    expected[i] + "." );
                }
            }
        }
        {
            int[] input = { 1, 6, 13, 8, 20 };
            int[] expected = { 6, 8 };
            int[] actual = ArrayQuestions.changeArray101( input );
            
            if ( expected.length != actual.length ) {
                throw new Exception( "Test failed: array have wrong length." );
            }
            for ( int i = 0; i < actual.length; ++i ) {
                if ( expected[i] != actual[i] ) {
                    throw new Exception( "Test failed: the " + i + 
                            " element should be " + actual[i] + " but was " + 
                                    expected[i] + "." );
                }
            }
        }
    }
    static public void test_changeArray102() throws Exception {
        {
            int[] input = { 1 };
            int[] expected = { 1 };
            int[] actual = ArrayQuestions.changeArray102( input );
            
            if ( expected.length != actual.length ) {
                throw new Exception( "Test failed: array have wrong length." );
            }
            for ( int i = 0; i < actual.length; ++i ) {
                if ( expected[i] != actual[i] ) {
                    throw new Exception( "Test failed: the " + i + 
                            " element should be " + actual[i] + " but was " + 
                                    expected[i] + "." );
                }
            }
        }
        {
            int[] input = { 1, 2 };
            int[] expected = { 1 };
            int[] actual = ArrayQuestions.changeArray102( input );
            
            if ( expected.length != actual.length ) {
                throw new Exception( "Test failed: array have wrong length." );
            }
            for ( int i = 0; i < actual.length; ++i ) {
                if ( expected[i] != actual[i] ) {
                    throw new Exception( "Test failed: the " + i + 
                            " element should be " + actual[i] + " but was " + 
                                    expected[i] + "." );
                }
            }
        }
        {
            int[] input = { 1, 6, 13, 8, 20 };
            int[] expected = { 1, 13, 20 };
            int[] actual = ArrayQuestions.changeArray102( input );
            
            if ( expected.length != actual.length ) {
                throw new Exception( "Test failed: array have wrong length." );
            }
            for ( int i = 0; i < actual.length; ++i ) {
                if ( expected[i] != actual[i] ) {
                    throw new Exception( "Test failed: the " + i + 
                            " element should be " + actual[i] + " but was " + 
                                    expected[i] + "." );
                }
            }
        }        
    }
}
