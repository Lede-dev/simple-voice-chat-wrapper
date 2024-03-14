package net.ledestudio.simplevoicechatwrapper.events;

import de.maxhenkel.voicechat.api.events.LeaveGroupEvent;

public class VoiceChatLeaveGroupEvent extends VoiceChatEvent {

    private final LeaveGroupEvent event;

    public VoiceChatLeaveGroupEvent(LeaveGroupEvent event) {
        this.event = event;
    }

    public LeaveGroupEvent getEvent() {
        return event;
    }
}
