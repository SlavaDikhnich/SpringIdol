package org.springInAction.springIdol.magicans;

import org.springInAction.springIdol.abstractive.MagicBox;

public class MagicBoxImpl implements MagicBox{

    public MagicBoxImpl() {
    }

    public String getContents() {
        return "A beautiful assistant";
    }
}
