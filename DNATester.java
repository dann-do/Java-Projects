public class DNATester{
    public static void main(String[] args){
        char[] first = {'a', 't', 'c', 'g'};
        DNA d1 = new DNA(first);

        char[] second = {'t', 'c', 'a', 'a'};
        DNA d2 = new DNA(second);

        System.out.println(d1.equals(d2));

        System.out.println(d1);

        DNA d3 = d1.swap(d2, 2);

        String newOut = d3.toString();
		
		System.out.print(newOut);
    }
}
