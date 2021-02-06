package belajar.java.oop.data;

public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Employee {
        private String name;

////        private String company;
////        public String getCompany() {
////            return company;
////        }
////        public void setCompany(String company) {
////            this.company = company;
//        }

        public String getName() {
            return name;
        }

        public String getCompany() {
            return Company.this.name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
