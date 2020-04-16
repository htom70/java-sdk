/*
 * (C) Copyright IBM Corp. 2017, 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.tone_analyzer.v3.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;
import java.util.List;

/** The results of the analysis for an utterance of the input content. */
public class UtteranceAnalysis extends GenericModel {

  @SerializedName("utterance_id")
  protected Long utteranceId;

  @SerializedName("utterance_text")
  protected String utteranceText;

  protected List<ToneChatScore> tones;
  protected String error;

  /**
   * Gets the utteranceId.
   *
   * <p>The unique identifier of the utterance. The first utterance has ID 0, and the ID of each
   * subsequent utterance is incremented by one.
   *
   * @return the utteranceId
   */
  public Long getUtteranceId() {
    return utteranceId;
  }

  /**
   * Gets the utteranceText.
   *
   * <p>The text of the utterance.
   *
   * @return the utteranceText
   */
  public String getUtteranceText() {
    return utteranceText;
  }

  /**
   * Gets the tones.
   *
   * <p>An array of `ToneChatScore` objects that provides results for the most prevalent tones of
   * the utterance. The array includes results for any tone whose score is at least 0.5. The array
   * is empty if no tone has a score that meets this threshold.
   *
   * @return the tones
   */
  public List<ToneChatScore> getTones() {
    return tones;
  }

  /**
   * Gets the error.
   *
   * <p>**`2017-09-21`:** An error message if the utterance contains more than 500 characters. The
   * service does not analyze the utterance. **`2016-05-19`:** Not returned.
   *
   * @return the error
   */
  public String getError() {
    return error;
  }
}
