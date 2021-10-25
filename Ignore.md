## Rounded to two decimal places
double roundOff = Math.round(check* 100.0) / 100.0;

## Try Catch 
            int hours=0;
            double grade=0.0;
            try{
                hours=Integer.parseInt(input[1]);
                grade=Double.parseDouble(input[2]);
            }
            catch(Exception e1)
            {
                System.out.println("FormatError:"+name);
                return;
            }
