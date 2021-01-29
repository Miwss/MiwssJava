package PractickJava;

public class ODemo {
    char q[]; //массив для хранения элементов очереди
    int putloc, getloc; //индексы для ставки и извлечения
                        //Элементов очереди
    ODemo(int size){
        q = new char[size+1];//выделить память для очереди
        putloc = getloc = 0;
    }
    void put(char ch){
        if(putloc == q.length -1){
            System.out.println(" - OChered zapolnena");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }
    char get(){
        if(getloc ==putloc){
            System.out.println(" - Ochered pysta");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}
