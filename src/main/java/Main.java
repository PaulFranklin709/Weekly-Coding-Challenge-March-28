public class Main {
    public static class Votes {
        private int upvotes;
        private int downvotes;

        public Votes(int upvotes, int downvotes) {
            this.upvotes = upvotes;
            this.downvotes = downvotes;
        }

        public int getUpvotes() {
            return upvotes;
        }

        public void setUpvotes(int upvotes) {
            this.upvotes = upvotes;
        }

        public int getDownvotes() {
            return downvotes;
        }

        public void setDownvotes(int downvotes) {
            this.downvotes = downvotes;
        }
    }
    public static void main(String[] args) {
        System.out.println(getVoteCount(new Votes(13, 0)));

        System.out.println(getVoteCount(new Votes(2, 33)));

        System.out.println(getVoteCount(new Votes(132, 132)));
    }
    public static int getVoteCount(Votes votes) {
        return votes.getUpvotes() - votes.getDownvotes();
    }
}
