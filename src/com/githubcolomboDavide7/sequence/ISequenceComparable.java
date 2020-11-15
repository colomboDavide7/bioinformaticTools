package com.githubcolomboDavide7.sequence;

public interface ISequenceComparable<T extends Sequence> {

    boolean matchSequence(T seq);

}
