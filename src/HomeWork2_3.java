public class HomeWork2_3 {
    public static void main(String[] args) {
        Noutbook noutbook1 = new Noutbook(new User("Турганалиев Дияз Авазович", "diyaz18.08@gmail.com", -1, "123456789", false), new HDD(5000, 200), new RAM(1000, "Hp"), new OperatingSystem("Windows", 10), new CPU("Intel ", "Core i5"));
        System.out.println(noutbook1);
    }
}
        class Noutbook {
            private HDD hdd;
            private RAM ram;
            private OperatingSystem operatingSystem;
            private CPU cpu;
            private User user;

            public Noutbook(User user,HDD hdd, RAM ram, OperatingSystem operatingSystem, CPU cpu) {
                this.user = user;
                this.hdd = hdd;
                this.ram = ram;
                this.operatingSystem = operatingSystem;
                this.cpu = cpu;
            }
            @Override
            public String toString(){
                String messageNoutbok = "User: "+user+"\nHDD: "+ hdd + "\nRAM: "+ram+"\nOperatingSystem: "+operatingSystem + "\nCPU:"+cpu;
                return messageNoutbok;
            }

            public HDD getHdd() {
                return hdd;
            }

            public void setHdd(HDD hdd) {
                this.hdd = hdd;
            }

            public RAM getRam() {
                return ram;
            }

            public void setRam(RAM ram) {
                this.ram = ram;
            }

            public OperatingSystem getOperatingSystem() {
                return operatingSystem;
            }

            public void setOperatingSystem(OperatingSystem operatingSystem) {
                this.operatingSystem = operatingSystem;
            }

            public CPU getCpu() {
                return cpu;
            }

            public void setCpu(CPU cpu) {
                this.cpu = cpu;
            }
        }
        class HDD{
            private double size;
            private int speed;

            public HDD(double size, int speed) {
                this.size = size;
                this.speed = speed;
            }
            @Override
            public String toString(){
                String messageHDD = "\nРазмер = "+size+"\nСкорость = "+speed;
                return messageHDD;
            }

            public double getSize() {
                return size;
            }

            public void setSize(double size) {
                this.size = size;
            }

            public int getSpeed() {
                return speed;
            }

            public void setSpeed(int speed) {
                this.speed = speed;
            }
        }
        class RAM{
            private double size;
            private String model;

            public RAM(double size, String model) {
                this.size = size;
                this.model = model;
            }
            @Override
            public String toString(){
                String messageCPU = "\nРазмер = "+size+"\nМодель = "+model;
                return messageCPU;
            }

            public double getSize() {
                return size;
            }

            public void setSize(double size) {
                this.size = size;
            }

            public String getModel() {
                return model;
            }

            public void setModel(String model) {
                this.model = model;
            }
        }
        class OperatingSystem{
            private String name;
            private int version;

            public OperatingSystem(String name, int version) {
                this.name = name;
                this.version = version;
            }
            @Override
            public String toString(){
                String messageCPU = "\nНазвание = "+name+"\nВерсия = "+version;
                return messageCPU;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getVersion() {
                return version;
            }

            public void setVersion(int version) {
                this.version = version;
            }
        }
        class CPU{
            private String model;
            private String version;

            public CPU(String model, String core) {
                this.model = model;
                this.version = core;
            }
            @Override
            public String toString(){
                String messageCPU = "\nМодель = "+model+"\nВерсия = "+version;
                return messageCPU;
            }

            public String getModel() {
                return model;
            }

            public void setModel(String model) {
                this.model = model;
            }

            public String getVersion() {
                return version;
            }

            public void setVersion(String version) {
                this.version = version;
            }
        }
        class User{
            String fullName;
            String login;
            int year;
            String password;
            boolean isTheAccountBlocked;

            public User(String fullName, String login, int year, String password, boolean isTheAccountBlocked) {
                this.fullName = fullName;
                this.login = login;

                if(year>0 && year<120){this.year = year;}
                this.password = password;
                this.isTheAccountBlocked = isTheAccountBlocked;
            }
            @Override
            public String toString(){
                String messageUser;
                if(isTheAccountBlocked) {
                    messageUser = "\nФИО: " + fullName + "\nЛогин: " + login + "\nВозраст: " + year + "\nПароль: " + password + "\nЗаблокирована ли учетная запись: " + "Да";
                }
                else
                {
                    messageUser = "\nФИО: " + fullName + "\nЛогин: " + login + "\nВозраст: " + year + "\nПароль: " + password + "\nЗаблокирована ли учетная запись: " + "Нет";
                }
                return messageUser;

            }


            public String getFullName() {
                return fullName;
            }

            public void setFullName(String fullName) {
                this.fullName = fullName;
            }

            public String getLogin() {
                return login;
            }

            public void setLogin(String login) {
                this.login = login;
            }

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                this.year = year;
            }

            public String getPassword() {
                return password;
            }
            public void setPassword(String password) {
                this.password = password;
            }
            public boolean isTheAccountBlocked() {
                return isTheAccountBlocked;
            }
            public void setTheAccountBlocked(boolean theAccountBlocked) {
                isTheAccountBlocked = theAccountBlocked;
            }
}

