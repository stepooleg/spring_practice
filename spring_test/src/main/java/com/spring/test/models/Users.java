package com.spring.test.models;

public class Users {

        public int ID;
        public String Name;

        public Users() {
        }

        public Users(int ID, String name) {
            this.ID = ID;
            Name = name;
        }

        public int getID() {
            return ID;
        }

        public String getName() {
            return Name;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public void setName(String name) {
            Name = name;
        }

        @Override
        public String toString() {
            return "Users{" +
                    "ID=" + ID +
                    ", Name='" + Name + '\'' +
                    '}';
        }

}
