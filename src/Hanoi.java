public class Hanoi {

    private int n;
    private String source, auxiliary, destination;
    private StringBuilder sb = null;


    public Hanoi(int n){
        this.n = n;
        this.source = "S";
        this.auxiliary = "A";
        this.destination = "D";
    }

    public void solve(int n, String source, String auxiliary, String destination){
        if(n == 1){
            sb.append(String.format("Slide Disk %d from rod %s to rod %s\n", n, source, destination));
        }
        else{
            solve(n - 1, source, destination, auxiliary);
            sb.append(String.format("Slide Disk %d from rod %s to rod %s\n", n, source, destination));
            solve(n - 1, auxiliary, source, destination);
        }
    }

    public String solve(){
        if(sb == null){
            sb = new StringBuilder();
            solve(this.n, this.source, this.auxiliary, this.destination);
            return sb.toString();
        }
        return sb.toString();
    }


}
