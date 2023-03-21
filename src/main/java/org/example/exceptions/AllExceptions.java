package org.example.exceptions;


public class AllExceptions {
    ExceptionOne eo = new ExceptionOne();
    ExceptionTwo et = new ExceptionTwo();
    ExceptionThree eth = new ExceptionThree();

    /**
     * This method contains three methods with those exceptions,
     * @throws Exception
     */
    public void allExceptions() throws Exception {
        eo.firstException();
        et.secondException();
        eth.thirdException();
    }

    class ExceptionOne {

        /**
         * This method contains one exception
         * @throws Exception
         */
        public void firstException() throws Exception {
            throw new Exception();
        }
    }

    class ExceptionTwo {

        /**
         * This method contains one exception
         * @throws Exception
         */
        public void secondException() throws Exception {
            throw new Exception();
        }
    }


    class ExceptionThree {

        /**
         * This method contains one exception
         * @throws Exception
         */
        public void thirdException() throws Exception {
            throw new Exception();
        }

    }
}