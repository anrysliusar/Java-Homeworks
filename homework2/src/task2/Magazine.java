package task2;

public class Magazine extends Book {
    private String topic;

    public Magazine() {
    }

    public Magazine(String topic) {
        this.topic = topic;
    }

    public Magazine(String name, int pages, int price, String topic) {
        super(name, pages, price);
        this.topic = topic;
    }

    public Magazine(int length, int width, String name, int pages, int price, String topic) {
        super(length, width, name, pages, price);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "topic='" + topic + '\'' +
                '}' + super.toString();
    }
}
