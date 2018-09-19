/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
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

package org.kie.workbench.common.forms.jbpm.server.service.formGeneration.impl.runtime;

import org.junit.Before;
import org.kie.soup.project.datamodel.commons.util.RawMVELEvaluator;
import org.kie.workbench.common.forms.jbpm.server.service.formGeneration.impl.AbstractBPMNFormGeneratorServiceTest;

import static org.mockito.Mockito.mock;

public abstract class BPMNRuntimeFormDefinitionGeneratorServiceTest extends AbstractBPMNFormGeneratorServiceTest<BPMNRuntimeFormGeneratorService, ClassLoader> {

    @Before
    public void setup() {

        source = mock(ClassLoader.class);

        service = new BPMNRuntimeFormGeneratorService(fieldManager,
                                                      new RawMVELEvaluator());
    }
}