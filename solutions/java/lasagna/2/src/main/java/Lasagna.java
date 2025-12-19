public class Lasagna {

    
    // TODO: define the 'expectedMinutesInOven()' method

    public int expectedMinutesInOven(){
        int expected_minutes = 40;
        return expected_minutes;
    }

    // TODO: define the 'remainingMinutesInOven()' method

    public int remainingMinutesInOven(int minutes_in_oven){
        int time_remaining = expectedMinutesInOven() - minutes_in_oven;
        return time_remaining;
    }

    // TODO: define the 'preparationTimeInMinutes()' method

    public int preparationTimeInMinutes(int added_layers){
        int preparation_time = added_layers * 2;
        return preparation_time;
    }

    // TODO: define the 'totalTimeInMinutes()' method

    public int totalTimeInMinutes(int added_layers, int minutes_in_oven){
        int total_time = preparationTimeInMinutes(added_layers) + minutes_in_oven;
        return total_time;
    }
}
