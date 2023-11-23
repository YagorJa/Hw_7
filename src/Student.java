    class Student implements Cloneable {
        String name;

        public Student(String name) {
            this.name = name;
        }

        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

