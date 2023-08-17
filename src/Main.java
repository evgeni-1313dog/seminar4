
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashMap1 = new HashMap<>(4);
        String oldValue = hashMap1.put("+79314783954", "AAA");
        oldValue = hashMap1.put("+79314783554", "AAA1");
        oldValue = hashMap1.put("+79314783952", "AAA2");
        oldValue = hashMap1.put("+79114783054", "AAA3");
        oldValue = hashMap1.put("+79104783954", "AAA4");
        oldValue = hashMap1.put("+79154783944", "AAA5");
        oldValue = hashMap1.put("+79314773954", "AAA6");
        oldValue = hashMap1.put("+79314783154", "AAA7");
        oldValue = hashMap1.put("+79314789954", "AAA8");
        oldValue = hashMap1.put("+79004783954", "AAA");

        String res1 = hashMap1.get("+79154783944");
        String res2 = hashMap1.get("+79154787944");

        String ress3 = hashMap1.remove("+79314773954");
        String ress4 = hashMap1.remove("+79314783954");
        String ress5 = hashMap1.remove("+79314773954");

        for (HashMap.Entity s: hashMap1)
        System.out.println(s);

    }
}