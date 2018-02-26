/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.workbench.common.stunner.client.widgets.toolbar.command;

import javax.inject.Inject;

import org.gwtbootstrap3.client.ui.constants.IconType;
import org.kie.workbench.common.stunner.core.client.i18n.ClientTranslationService;
import org.kie.workbench.common.stunner.core.client.session.command.impl.ExportToBpmnSessionCommand;
import org.kie.workbench.common.stunner.core.client.session.command.impl.SessionCommandFactory;
import org.kie.workbench.common.stunner.core.client.session.impl.AbstractClientSession;
import org.kie.workbench.common.stunner.core.i18n.CoreTranslationMessages;

public class ExportToBpmnToolbarCommand extends AbstractToolbarCommand<AbstractClientSession, ExportToBpmnSessionCommand> {

    @Inject
    public ExportToBpmnToolbarCommand(final SessionCommandFactory sessionCommandFactory,
                                      final ClientTranslationService translationService) {
        super(sessionCommandFactory.newExportToBpmnSessionCommand(),
              translationService);
    }

    @Override
    protected boolean requiresConfirm() {
        return false;
    }

    @Override
    public IconType getIcon() {
        return IconType.FILE_TEXT_O;
    }

    @Override
    public String getCaption() {
        return translationService.getKeyValue(CoreTranslationMessages.EXPORT_BPMN);
    }

    @Override
    public String getTooltip() {
        return translationService.getKeyValue(CoreTranslationMessages.EXPORT_BPMN);
    }
}