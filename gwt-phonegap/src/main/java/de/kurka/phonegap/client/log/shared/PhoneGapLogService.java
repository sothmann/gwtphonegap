/*
 * Copyright 2011 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package de.kurka.phonegap.client.log.shared;

import java.util.List;
import java.util.logging.LogRecord;

import com.google.gwt.user.client.rpc.RemoteService;

/**
 * @author Daniel Kurka
 * 
 */
public interface PhoneGapLogService extends RemoteService {
	public String logOnServer(String clientId, List<LogRecord> record);
}
