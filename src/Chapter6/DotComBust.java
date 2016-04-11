package Chapter6;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses=0;
    private void setUpGame(){
        DotCom one = new DotCom();
        one.setName("Yandex.ru");
        DotCom two = new DotCom();
        two.setName("HabraHabr.ru");
        DotCom three = new DotCom();
        two.setName("Tut.by");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Ваша цель - потопить три сайта.");
        System.out.println("Yandex.ru, HabraHabr.ru и Tut.by");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        for(DotCom dotComToSet:dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }

    }
    private void startPlaying(){
        while(!dotComsList.isEmpty()){
            String userGuess=helper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result="Мимо";
        for(DotCom dotComToTest:dotComsList){
            result =dotComToTest.checkYourself(userGuess);
            if(result.equals("Попал")){
                break;
            }
            if (result.equals("Потопил")){
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }
    public void finishGame(){
        System.out.println("Все сайты ушли ко дну! Ваши акции теперь ничего не стоят.");
        if(numOfGuesses<=18){
            System.out.println("Это заняло у вас всего "+ numOfGuesses+"попыток");
        }else
            System.out.println("Это заняло у вас довольно много времени. "+ numOfGuesses+"попыток");
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
