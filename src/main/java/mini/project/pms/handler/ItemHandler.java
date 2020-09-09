package mini.project.pms.handler;

import java.util.List;
import mini.project.pms.domain.Item;
import mini.project.util.Prompt;

public class ItemHandler {

  List<Item> itemList;

  public ItemHandler(List<Item> list) {
    this.itemList = list;
  }

  public void add() {
    System.out.println("[아이템 등록]");

    Item item = new Item();
    item.setNo(Prompt.inputInt("번호? "));
    item.setName(Prompt.inputString("이름? "));
    item.setFunction(Prompt.inputString("기능? "));
  }




}