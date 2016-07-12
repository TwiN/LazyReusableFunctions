# TODO: it's late at night and I'm tired so
# FIXME: use better variable names, a better function name as well as a better
'''
Function that checks if a sentence has a word which is the same as one of the word in a list.
@param list_of_words
@param sentence_to_check
'''
def is_string_from_list_in_sentence(list_of_words, sentence_to_check):
    words = sentence_to_check.split(" ")
    for element in list_of_words:
        for word in words:
            if element == word:
                return True
    return False

# (bad) Examples:
is_string_from_list_in_sentence(["lol", "hey", "small"], 'you are small') # True
is_string_from_list_in_sentence(["lol", "hey", "small"], 'you are big') # False
is_string_from_list_in_sentence(["lol", "hey", "small"], 'you are smally') # False
