class SY2022bit024 {
    public static void main(String[] args) {
        String a = "2032bit024 ";
        String[] b = new String[a.length()];

        for (int i = 0; i < a.length(); i++) {
            b[i] = String.valueOf(a.charAt(i));
        }
        
        SY2022bit024 c = new SY2022bit024();
        int d = c.getValidRegistrationsCount(b);
        System.out.println(d);
    }

    public int getValidRegistrationsCount(String[] registrations) {
        if (registrations.length != 10 && Integer.parseInt(registrations[0]) != 2
                && Integer.parseInt(registrations[1]) != 0) {
            return 0;
        } else if (Integer.parseInt(registrations[0]) == 2 && Integer.parseInt(registrations[1]) == 0) {
            for (int i = 2; i < registrations.length; i++) {
                if (i==2) {
                    if (Integer.parseInt(registrations[i]) < 3) {
                        if (Integer.parseInt(registrations[i]) == i) {
                            if (Integer.parseInt(registrations[3]) < 5) {
                                continue;
                            } else {
                                break;
                            }
                        }
                    } else {
                        break;
                    }
                }
                else if (i == 5 && (registrations[4].codePointAt(4)==98)) {
                        if(registrations[i].compareTo("c")==0){
                            if(registrations[i+1].codePointAt(i+1)== 115 || registrations[i+1].codePointAt(i+1)== 101 || registrations[i+1].codePointAt(i+1)== 104 )
                            {
                                return 1;
                            }
                            else 
                            {
                                return 0;
                            }
                        }
                        else if(registrations[i].compareTo("i")==0){
                            if(registrations[i+1].codePointAt(i+1)== 116)
                            {
                                return 1;
                            }
                            else{
                                return 0;
                            }
                        }
                        else if(registrations[i].compareTo("m")==0){
                            if(registrations[i+1].codePointAt(i+1)== 101)
                            {
                                return 1;
                            }
                            else{
                                return 0;
                            }
                        }
                    }
                    else{
                         return 0;}

                }
            }
        }
        else {
            return 0;
        }
}
