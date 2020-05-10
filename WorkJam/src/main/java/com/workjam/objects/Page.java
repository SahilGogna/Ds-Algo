package main.java.com.workjam.objects;

public class Page {

    /**
     * The page object is used to limit the number of users returned in the list.
     * Fields:
     *      startPos
     *          The position from which we return the users
     *      size
     *          The number of users to return
     *
     *  Ex: If we had a list of 20 users, 
     *  we pass startPos=10 and size=5, we would return the users 10-11-12-13-14
     */

    private final int startPos;
    private final int size;

    public Page(int startPos, int size) {
        if (startPos < 0 || size < 0) {
            throw new IllegalStateException("Invalid negative position or size for pagination.");
        }
        this.startPos = startPos;
        this.size = size;
    }

    public int getStartPos() {
        return startPos;
    }

    public int getSize() {
        return size;
    }

}
