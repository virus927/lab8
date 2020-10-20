package ru.mirea;

public class lab8 {
    public static void main(String[] args) {
        IWaitList<Integer> wl1 = new WaitList<>();
        BoundedWaitList<Integer> wl2 = new BoundedWaitList<>(5);
        UnfairWaitList<Integer> wl3 = new UnfairWaitList<>();
        System.out.println(wl1);
        System.out.println(wl2);
        System.out.println(wl3);

        for (int i = 0; i < 7; i++) {
            wl1.add(i);
            wl2.add(i);
            wl3.add(i);
        }
        System.out.println(wl1);
        System.out.println(wl2);
        System.out.println(wl3);


        wl3.moveToBack(3);
        System.out.println(wl3);

        emptyWaitList(wl1);
        emptyWaitList(wl2);
        emptyWaitList(wl3);

        System.out.println(wl1);
        System.out.println(wl2);
        System.out.println(wl3);
    }
    public static <E> void emptyWaitList(IWaitList<E> wl) {
        while (! wl.isEmpty()) {
            wl.remove();
        }
    }
}
