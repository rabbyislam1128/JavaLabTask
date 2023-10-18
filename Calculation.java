public class Calculation {

    public double Vacation(int a1, int a2, int a3, String a4) {


        //officer
        if (a4 == "Officer") {
            //leap year
            if (a3 % 4 == 0) {

                //days
                if (a2 % 2 == 0) {
                    int day = 31 - a1;
                    int month = 30 * (12 - a2);
                    int year = 0;
                    int Tday = day + month;

                    double LeaveDays = ((Tday + 1) * 15) / 365;
                    System.out.println("Leave: " + LeaveDays);
                    return LeaveDays;
                } else {
                    int day = 31 - a1;
                    int month = 31 * (12 - a2);
                    int year = 0;
                    int Tday = day + month;

                    double LeaveDays = ((Tday + 1) * 15) / 365;
                    System.out.println("Leave: " + LeaveDays);
                    return LeaveDays;
                }


            } else {
                if (a2 % 2 == 0) {
                    int day = 31 - a1;
                    int month = 30 * (12 - a2);
                    int year = 0;
                    int Tday = day + month;

                    double LeaveDays = ((Tday + 1) * 15) / 366;
                    System.out.println("Leave: " + LeaveDays);
                    return LeaveDays;
                } else {
                    int day = 31 - a1;
                    int month = 31 * (12 - a2);
                    int year = 0;
                    int Tday = day + month;

                    double LeaveDays = ((Tday + 1) * 15) / 366;
                    System.out.println("Leave: " + LeaveDays);
                    return LeaveDays;

                }

            }

        } else if (a4 == "Stuff") {
            if (a3 % 4 == 0) {

                if (a2 % 2 == 0) {
                    int day = 31 - a1;
                    int month = 30 * (12 - a2);
                    int year = 0;
                    int Tday = day + month;

                    double LeaveDays = ((Tday + 1) * 10) / 365;
                    System.out.println("Leave: " + LeaveDays);
                    return LeaveDays;
                } else {
                    int day = 31 - a1;
                    int month = 31 * (12 - a2);
                    int year = 0;
                    int Tday = day + month;

                    double LeaveDays = ((Tday + 1) * 10) / 365;
                    System.out.println("Leave: " + LeaveDays);
                    return LeaveDays;
                }


            } else {
                if (a2 % 2 == 0) {
                    int day = 31 - a1;
                    int month = 30 * (12 - a2);
                    int year = 0;
                    int Tday = day + month;

                    double LeaveDays = ((Tday + 1) * 10) / 366;
                    System.out.println("Leave: " + LeaveDays);
                    return LeaveDays;
                } else {
                    int day = 31 - a1;
                    int month = 31 * (12 - a2);
                    int year = 0;
                    int Tday = day + month;

                    double LeaveDays = ((Tday + 1) * 10) / 366;
                    System.out.println("Leave: " + LeaveDays);
                    return LeaveDays;

                }

            }


        }
        else {
            return 0;
        }


            //System.out.println("Leave: "+LeaveDays);

    }



    public double Sick(int a1, int a2, int a3, String a4) {

        if (a4 == "Officer") {
            //leap year
            if (a3 % 4 == 0) {

                //days
                if (a2 % 2 == 0) {
                    int day = 31 - a1;
                    int month = 30 * (12 - a2);
                    int year = 0;
                    int Tday = day + month;

                    double LeaveDays = (double) ((Tday + 1) * 10) / 365;
                    System.out.println("Leave: " + LeaveDays);
                    return LeaveDays;
                } else {
                    int day = 31 - a1;
                    int month = 31 * (12 - a2);
                    int year = 0;
                    int Tday = day + month;

                    double LeaveDays = (double) ((Tday + 1) * 10) / 365;
                    System.out.println("Leave: " + LeaveDays);
                    return LeaveDays;
                }


            } else {
                if (a2 % 2 == 0) {
                    int day = 31 - a1;
                    int month = 30 * (12 - a2);
                    int year = 0;
                    int Tday = day + month;

                    double LeaveDays = (double) ((Tday + 1) * 10) / 366;
                    System.out.println("Leave: " + LeaveDays);
                    return LeaveDays;
                } else {
                    int day = 31 - a1;
                    int month = 31 * (12 - a2);
                    int year = 0;
                    int Tday = day + month;

                    double LeaveDays = (double) ((Tday + 1) * 10) / 366;
                    System.out.println("Leave: " + LeaveDays);
                    return LeaveDays;

                }

            }

        } else if (a4 == "Stuff") {
            if (a3 % 4 == 0) {

                if (a2 % 2 == 0) {
                    int day = 31 - a1;
                    int month = 30 * (12 - a2);
                    int year = 0;
                    int Tday = day + month;

                    double LeaveDays = (double) ((Tday + 1) * 7) / 365;
                    System.out.println("Leave: " + LeaveDays);
                    return LeaveDays;
                } else {
                    int day = 31 - a1;
                    int month = 31 * (12 - a2);
                    int year = 0;
                    int Tday = day + month;

                    double LeaveDays = (double) ((Tday + 1) * 7) / 365;
                    System.out.println("Leave: " + LeaveDays);
                    return LeaveDays;
                }


            } else {
                if (a2 % 2 == 0) {
                    int day = 31 - a1;
                    int month = 30 * (12 - a2);
                    int year = 0;
                    int Tday = day + month;

                    double LeaveDays = (double) ((Tday + 1) * 7) / 366;
                    System.out.println("Leave: " + LeaveDays);
                    return LeaveDays;
                } else {
                    int day = 31 - a1;
                    int month = 31 * (12 - a2);
                    int year = 0;
                    int Tday = day + month;

                    double LeaveDays = (double) ((Tday + 1) * 7) / 366;
                    System.out.println("Leave: " + LeaveDays);
                    return LeaveDays;

                }

            }


        }
        else {
            return 0;
        }


    }

}

