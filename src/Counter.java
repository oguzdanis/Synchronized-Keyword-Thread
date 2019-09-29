import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

public class Counter {

    private int count;

    // “synchronized” anahtar kelimesi yardımıyla, “arttir()” metodunun aynı anda yalnızca bir
    // thread tarafından çağrılabileceğini garanti edelim.
    public synchronized void arttir(){
        count++;
    }

    public synchronized int getCount() {
        return count;
    }

/*
    public void arttir(){
        count++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
*/

}
