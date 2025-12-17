
EXPECTED_BAKE_TIME = 40
PREPARATION_TIME = 2


def bake_time_remaining(elapsed_bake_time):
    """
    Calculate the time remaining for the lasagna to finish baking
     :param 
     elapsed_bake_time: int - elapsed cooking time.
     :return: 
     int - total baking time remaining (in minutes).
    """
    
    time_remaining = EXPECTED_BAKE_TIME - elapsed_bake_time
    return time_remaining


def preparation_time_in_minutes(number_of_layers):
    """
    Calculate the preparation time for the determined number of layers
    :param 
     number_of_layers: int - layers being prepared.
    :return: 
     int - total preparation time to complete the layers (in minutes).
    """
    necessary_minutes = number_of_layers * PREPARATION_TIME
    return necessary_minutes


def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """Calculate the elapsed cooking time.

    :param number_of_layers: int - the number of layers in the lasagna.
    :param elapsed_bake_time: int - elapsed cooking time.
    :return: int - total time elapsed (in minutes) preparing and cooking.

    This function takes two integers representing the number of lasagna layers and the
    time already spent baking and calculates the total elapsed minutes spent cooking the
    lasagna.
    """
    elapsed_time = (number_of_layers * 2) + elapsed_bake_time
    return elapsed_time
