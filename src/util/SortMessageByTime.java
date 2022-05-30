package util;

import domain.Message;

import java.util.Comparator;

public class SortMessageByTime implements Comparator<Message> {
    private final StringUtil stringUtil = new StringUtil();

    @Override
    public int compare(Message o1, Message o2) {
        return stringUtil.convertStringToDate(o1.getTime())
                .compareTo(stringUtil.convertStringToDate(o2.getTime()));
    }
}
