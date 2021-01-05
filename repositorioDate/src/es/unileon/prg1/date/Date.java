package es.unileon.prg1.date;


/**
 * @author mario
 * @version 1
 */


public class Date{
    private int day;
    private int month;
    private int year;

    /**
     * Crea un objeto tipo fecha
     * 
     * @param day
     * @param month
     * @param year
     * @throws DateException
     */
    public Date(int day, int month, int year) throws DateException {
        this.setMonth(month);
        this.setDay(day);
        this.setYear(year);
    }

    /**
     * Establece el dia de la fecha
     * @param day
     */
    public void setDay(int day) throws DateException{
        if(day<1 || day>this.getDaysOfMonth() ){
            throw new DateException("Date error: Day "+day+ " of month "+ this.month + " not valid");
        }else{
            this.day =day;      
        }
    }
    
    /**
     * Establece el mes de la fecha
     * @param month
     */
    public void setMonth(int month) throws DateException{
        if(month<1 || month>12){
            throw new DateException("Date error: Month "+month+" not valid");
        } else{
            this.month = month;
        }
    }

    /**
     * Establece el mes de la fecha
     * @param year
     */
    public void setYear(int year) throws DateException{
        if(year<=0){
            throw new DateException("Year error: Year "+year+" not valid");
        }else{
        this.year = year;
        }
    }

    /**
     * 
     * @return Devuelve el numero de dias del mes
     */
    private int getDaysOfMonth(){
        int numDays=0;
        switch(this.month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                    numDays=31;break;
            case 4:
            case 6:
            case 9:
            case 11:
                    numDays=30;break;
            case 2: numDays=28;break;

        }
        return numDays;
    }
    
    /**
     * @return Devuelve el dia
     */
    public int getDay(){
        return this.day;
    }

    /**
     * @return Devuelve el mes
     */
    public int getMonth(){
        return this.month;
    }

    /**
     * @return Devuelve el año
     */
    public int getYear(){
        return this.year;
    }

    /**
     * @param anotherDate
     * @return Identifica si las fechas tienen el mismo año
     */
    public boolean isSameYear(Date anotherDate){
        if(getYear() ==anotherDate.getYear()){
            return true;
        }else{
            return false;
        }
    }

    /**
     * @param anotherDate
     * @return Identifica si las fechas tienen el mismo mes
     */
    public boolean isSameMonth(Date anotherDate){
        if(getMonth()==anotherDate.getMonth()){
            return true;
        } else{
            return false;
        }
    }

    /**
     * @param anotherDate
     * @return Identifica si las fechas tiene el mismo dia
     */
    public boolean isSameDay(Date anotherDate){
        if(getDay()==anotherDate.getDay()){
            return true;
        } else{
            return false;
        }
    }

    /**
     * @param anotherDate
     * @return Identifica si las fechas son iguales
     */
    public boolean isSame(Date anotherDate){
        if(isSameDay(anotherDate)==true && isSameMonth(anotherDate)==true && isSameYear(anotherDate)==true){
            return true;
        } else{
            return false;
        }
    }

    /**
     * @param anotherDate 
     * @return Identifica si las fechas tienen el mismo dia 
     */
    public boolean isSameDayWithoutIF(Date anotherDate){
        return getDay()==anotherDate.getDay();
    }

    /**
     * @param anotherDate
     * @return Identifica si las fechas tienen el mismo mes
     */
    public boolean isSameMonthWithoutIF(Date anotherDate){
        return getMonth()==anotherDate.getMonth();
    }

    /**
     * @param anotherDate
     * @return Identifica si las fechas tienen el mismo año
     */
    public boolean isSameYearWithoutIF(Date anotherDate){
        return getYear()==anotherDate.getYear();
    }

    /**
     * @param anotherDate
     * @return Identifica si las fechas son iguales
     */
    public boolean isSameWithoutIF(Date anotherDate){
        return isSameDayWithoutIF(anotherDate)==true && isSameMonthWithoutIF(anotherDate)==true && isSameYearWithoutIF(anotherDate)==true;
    }

    /**
     * @return Devuelve el nombre del mes
     */
    public String getMonthName(){
        String MonthName="";
        switch(getMonth()){
            case 1: MonthName="Enero";break;
            case 2: MonthName="Febrero";break;
            case 3: MonthName="Marzo";break;
            case 4: MonthName="Abril";break;
            case 5: MonthName="Mayo";break;
            case 6: MonthName="Junio";break;
            case 7: MonthName="Julio";break;
            case 8: MonthName="Agosto";break;
            case 9: MonthName="Septiembre";break;
            case 10: MonthName="Octubre";break;
            case 11: MonthName="Noviembre";break;
            case 12: MonthName="Diciembre";break;
        }
        return MonthName;
    }

    /**
     * @return Devuelve la estación del mes
     */
    public String getMonthSeason(){
        String SeasonName="";
        switch(getMonth()){
            case 1:
            case 2:
            case 12:
                SeasonName="Invierno";break;
            
            case 3:
            case 4:
            case 5:
                SeasonName="Primavera";break;

            case 6:
            case 7:
            case 8:
                SeasonName="Verano";break;

            case 9:
            case 10:
            case 11:
                SeasonName="Otoño";break;   
        }
        return SeasonName;
    }

    /**
     * @return Devuelve los meses restantes para acabar el año
     */
    public String getMonthsLeft(){
        StringBuffer monthsLeft = new StringBuffer();
        for(int i=getMonth();i<12;i++){
            this.month = month+1;
            monthsLeft.append(getMonthName()+" ");
        }
        return monthsLeft.toString();
    }

    /**
     * @return Devuelve la fecha en formato String
     */
    public String dateString(){
        return this.day+"/"+this.month+"/"+this.year;
    }

    /**
     * @return Devuelve las fechas restantes del mes
     */
    public String getDaysLeft(){
        StringBuffer daysLeft = new StringBuffer();
        for(int i=getDay();i<getDaysOfMonth();i++){
            this.day = day+1;
            daysLeft.append(dateString()+" ");
        }
        return daysLeft.toString();
    }

    /**
     * @return Devuelve los meses con el mismo numero de días que el mes de la fecha
     * @throws DateException
     */
    public String getMonthsWithSameDays() throws DateException{
        StringBuffer monthsWithSameDays = new StringBuffer();
        for(int i=1;i<=12;i++){
            Date testDay = new Date(1,i,2000);
            if(getDaysOfMonth()==testDay.getDaysOfMonth() && testDay.getMonth()!=getMonth()){
                monthsWithSameDays.append(testDay.getMonthName()+" ");
            }
        }
        return monthsWithSameDays.toString();
    }

    /**
     * @return Devuelve los dias que han transcurrido del año
     * @throws DateException
     */
    public int getDaysCountOfYear() throws DateException{
        int daysCount=0;
        for(int j=1;j<=getMonth();j++){
            if(j==getMonth()){
                for(int i=1;i<=getDay();i++){
                    daysCount = daysCount+1;
                }
            }else{
                Date auxDate = new Date(1,j,2000);
                for(int i=1;i<=auxDate.getDaysOfMonth();i++){
                    daysCount = daysCount+1;
                }
            }
        }
        return daysCount;
    }


    /**
     * Devuelve el numero de dias de un mes al recibir el mes
     * @param month
     * @return
     */
    private int getDaysOfMonthWithInt(int month){
        int numDays=0;
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                    numDays=31;break;
            case 4:
            case 6:
            case 9:
            case 11:
                    numDays=30;break;
            case 2: numDays=28;break;

        }
        return numDays;
    }

    /**
     * Devuelve el numero de intentos necesarios para igualar una fecha, con While
     * @return
     * @throws DateException
     */
    public int numAttemptsRandomDateSameYearWithWhile() throws DateException{
        int attempts=1;
        int mes= (int)(Math.random()*12+1);
        int dia= (int)(Math.random()*getDaysOfMonthWithInt(mes)+1);

        while(!isSame(new Date(dia,mes,this.year))){
            mes=(int)(Math.random()*12+1);
            dia=(int)(Math.random()*getDaysOfMonthWithInt(mes)+1);
            attempts++;
        }
        return attempts ;
    }

    /**
     * Devuelve el numero de intentos necesarios para igualar una fecha, con doWhile
     * @return
     * @throws DateException
     */
    public int numAttemptsRandomDateSameYearWithDoWhile() throws DateException{
        int attempts=0;
        int dia=0;
        int mes=0;
        Date auxDate;
        do {
            mes= (int)(Math.random()*12+1);
            dia= (int)(Math.random()*getDaysOfMonthWithInt(mes)+1);
            auxDate = new Date(dia,mes,this.year);
            attempts++;
            
        } while(!isSame(auxDate));
        return attempts;
    }

    /**
     * Devuelve el nombre del dia de la semana
     * @param dia
     * @return
     */
    public String nameDayOfWeek(int dia){
        String nameDay="";
        switch(dia){
            case 1: nameDay="Lunes";break;
            case 2: nameDay="Martes";break;
            case 3: nameDay="Miercoles";break;
            case 4: nameDay="Jueves";break;
            case 5: nameDay="Viernes";break;
            case 6: nameDay="Sabado";break;
            case 7: nameDay="Domingo";break;
            default: nameDay= "Dia incorrecto";break;
        }
        return nameDay;
    }

    /**
     * Devuelve el nombre del dia de la semana al recibir,como parametro, el dia de la semana del primer dia del año
     * @param firstDayOfYear
     * @return
     * @throws DateException
     */
    public String DayOfWeek(int firstDayOfYear) throws DateException {
        int dayNumber= (getDaysCountOfYear()%7)+firstDayOfYear;
        String DayOfTheWeek= "El "+dateString()+" es "+nameDayOfWeek(dayNumber);
        return DayOfTheWeek;
    }

    



    public String toString(){
        return this.day+"/"+this.month+"/"+this.year;
    }
}