class Computer {
    public void playMusic(){
        System.out.println("Music Playing . . .");
    }
    public String getMeAPen(int cost){
        return "Pen";
    }
}

class Student{
    int rollNo;
    String name;
    int marks;
}

class Hello{

    public static void main(String[] args) {

        Computer obj = new Computer();
//        obj.playMusic();
        String str = obj.getMeAPen(10);
//        System.out.println(str);

        int nums[][] = new int[3][4];


        for(int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

//        for(int i = 0; i < nums.length; i++){
//            for (int j = 0; j < nums[i].length; j++){
//                System.out.print(nums[i][j] + " ");
//            }
//            System.out.println();
//        }

//        for(int n[] : nums){
//            for (int m : n){
//                System.out.print(m+ " ");
//            }
//            System.out.println();
//        }

        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Ujjwal";
        s1.marks = 97;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Aman";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "Vicky";
        s3.marks = 33;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].rollNo + " " + students[i].name + " : " + students[i].marks);
        }
    }
}