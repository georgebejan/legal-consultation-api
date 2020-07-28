package com.code4ro.legalconsultation.service.api;

import com.code4ro.legalconsultation.invitation.model.persistence.Invitation;
import com.code4ro.legalconsultation.model.persistence.DocumentMetadata;
import com.code4ro.legalconsultation.user.model.persistence.User;
import java.util.List;

public interface MailApi {

    void sendRegisterMail(final List<Invitation> invitations);
    void sendDocumentAssignedEmail(final DocumentMetadata documentMetadata, final List<User> users);
}
