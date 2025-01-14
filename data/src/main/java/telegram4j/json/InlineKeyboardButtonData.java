package telegram4j.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonSerialize(as = ImmutableInlineKeyboardButtonData.class)
@JsonDeserialize(as = ImmutableInlineKeyboardButtonData.class)
public interface InlineKeyboardButtonData {

    static ImmutableInlineKeyboardButtonData.Builder builder() {
        return ImmutableInlineKeyboardButtonData.builder();
    }

    String text();

    Optional<String> url();

    @JsonProperty("login_url")
    Optional<LoginUrlData> loginUrl();

    @JsonProperty("callback_data")
    Optional<String> callbackData();

    @JsonProperty("switch_inline_query")
    Optional<String> switchInlineQuery();

    @JsonProperty("switch_inline_query_current_chat")
    Optional<String> switchInlineQueryCurrentChat();

    @JsonProperty("callback_game")
    Optional<CallbackGameData> callbackGame();

    boolean pay();
}
