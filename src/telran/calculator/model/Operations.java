package telran.calculator.model;

public enum Operations {
    AND {
        @Override
        public int apply(int x, int y) {
            return x & y;
        }
    },
    OR {
        @Override
        public int apply(int x, int y) {
            return x | y;
        }
    },
    XOR {
        @Override
        public int apply(int x, int y) {
            return x ^ y;
        }
    },
    NOT {
        @Override
        public int apply(int x, int y) {
            return ~x; 
        }
    },
    SHIFT_LEFT {
        @Override
        public int apply(int x, int y) {
            return x << y;
        }
    },
    SHIFT_RIGHT {
        @Override
        public int apply(int x, int y) {
            return x >> y;
        }
    },
    UNSIGNED_SHIFT_RIGHT {
        @Override
        public int apply(int x, int y) {
            return x >>> y;
        }
    };


    //TODO

    public abstract int apply(int x, int y);


}
