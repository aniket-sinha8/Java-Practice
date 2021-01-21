public class WeekDay {
    public static void main(String args[]) {
        int dayNo = 4;
        switch(dayNo)
        {
            case 1: System.out.println("Day number " + dayNo + " is Monday.");
                    break;
            case 2: System.out.println("Day number " + dayNo + " is Tuesday.");
                    break;
            case 3: System.out.println("Day number " + dayNo + " is Wednesday.");
                    break;
            case 4: System.out.println("Day number " + dayNo + " is Thursday.");
                    break;
            case 5: System.out.println("Day number " + dayNo + " is Friday.");
                    break;
            case 6: System.out.println("Day number " + dayNo + " is Saturday.");
                    break;
            case 7: System.out.println("Day number " + dayNo + " is Sunday.");
                    break;
            default: System.out.println("ERROR");
        }
    }
}